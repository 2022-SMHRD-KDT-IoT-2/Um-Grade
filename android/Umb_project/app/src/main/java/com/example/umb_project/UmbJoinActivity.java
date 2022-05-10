package com.example.umb_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class UmbJoinActivity extends AppCompatActivity {

    EditText edtJoinId, edtJoinPw,edtJoinName, edtJoinNick, edtJoinEmail, edtJoinPhone, edtJoinAddr;
    Button btnSuccess;

    RequestQueue queue;
    StringRequest request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_join);

        edtJoinId = findViewById(R.id.edtJoinPw);
        edtJoinPw = findViewById(R.id.edtJoinName);
        edtJoinName = findViewById(R.id.edtJoinName);
        edtJoinNick = findViewById(R.id.edtJoinNick);
        edtJoinEmail = findViewById(R.id.edtJoinEmail);
        edtJoinPhone = findViewById(R.id.edtJoinPhone);
        edtJoinAddr = findViewById(R.id.edtJoinAddr);
        btnSuccess = findViewById(R.id.btnSuccess);

        queue = Volley.newRequestQueue(UmbJoinActivity.this);

        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int method = Request.Method.POST;
                String server_url = "http://220.80.203.18:8081/myapp/Join";

                request = new StringRequest(
                        method,
                        server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                Toast.makeText(UmbJoinActivity.this,
                                        "회원가입 성공!",
                                        Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(UmbJoinActivity.this, UmbLoginActivity.class);

                                startActivity(intent);

                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(UmbJoinActivity.this,
                                        "회원가입 실패!" + error.toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                ){
                    @NonNull
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError{
                        Map<String, String> param = new HashMap<>();

                        param.put("user_id", edtJoinId.getText().toString());
                        param.put("user_pw", edtJoinPw.getText().toString());
                        param.put("user_name", edtJoinName.getText().toString());
                        param.put("user_nick", edtJoinNick.getText().toString());
                        param.put("user_email", edtJoinEmail.getText().toString());
                        param.put("user_phone", edtJoinPhone.getText().toString());
                        param.put("user_addr", edtJoinAddr.getText().toString());

                        return param;
                    }
                }; //end
                queue.add(request);
            }
        });
    }
}