package com.example.umb_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.umb_project.info.UserInfo;
import com.example.umb_project.vo.User;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.HashMap;
import java.util.Map;

public class UmbQrActivity extends AppCompatActivity {

    RequestQueue queue;
    StringRequest request;
    User user = UserInfo.info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_qr);
        queue = Volley.newRequestQueue(UmbQrActivity.this);
        new IntentIntegrator(this).initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(this,"실패" , Toast.LENGTH_LONG).show();
                // todo
            } else {
                Toast.makeText(this, user.getUser_id(), Toast.LENGTH_LONG).show();
                int method = Request.Method.POST;

                String server_url = "http://220.71.97.131:8081/myapp/Rent";

                request = new StringRequest(
                        method,
                        server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(UmbQrActivity.this,
                                        "QR_onErrorResponse" + error.toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                ){
                    @NonNull
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> param = new HashMap<>();

                        param.put("qrNum",result.getContents());
                        param.put("userId",user.getUser_id());
                        return param;
                    }
                };

                queue.add(request);
                // todo
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}