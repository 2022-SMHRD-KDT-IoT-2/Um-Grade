package com.example.umb_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.umb_project.info.UserInfo;
import com.example.umb_project.vo.User;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class UmbLoginActivity extends AppCompatActivity {

    EditText edtId, edtPw;
    Button btnJoin, btnLogin;
    CheckBox auto;
    RequestQueue queue;
    StringRequest request;

   String user_id, user_pw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_login);

        edtId = findViewById(R.id.edtId);
        edtPw = findViewById(R.id.edtPw);
        btnJoin = findViewById(R.id.btnJoin);
        btnLogin = findViewById(R.id.btnLogin);
        auto = findViewById(R.id.auto);

        queue = Volley.newRequestQueue(UmbLoginActivity.this);

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UmbLoginActivity.this, UmbJoinActivity.class);

                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int method = Request.Method.POST;

                String server_url = "http://220.80.203.18:8081/myapp/Login";


                request = new StringRequest(
                        method,
                        server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {


                                if (response.length() > 1) {
                                    try {
                                        JSONObject jsonObject = new JSONObject(response);
                                        String user_id = jsonObject.getString("user_id");
                                        String user_pw = jsonObject.getString("user_pw");
                                        String user_name = jsonObject.getString("user_name");
                                        String user_nick = jsonObject.getString("user_nick");
                                        String user_email = jsonObject.getString("user_email");
                                        String user_phone = jsonObject.getString("user_phone");
                                        String user_joindate = jsonObject.getString("user_joindate");
                                        String user_addr = jsonObject.getString("user_addr");
                                        String user_type = jsonObject.getString("user_type");
                                        String user_status = jsonObject.getString("user_status");
                                        String user_point = jsonObject.getString("user_point");

                                        User vo = new User(user_id, user_pw, user_name, user_nick, user_email, user_phone, user_joindate, user_addr, user_type, user_status, user_point);

                                        UserInfo.info = vo;

                                        Intent intent = new Intent(UmbLoginActivity.this, UmbMainActivity.class);

                                        intent.putExtra("response", response);

                                        startActivity(intent);

                                        finish();

                                        if(auto.isChecked()) {
                                            if(user_id.equals(vo.getUser_id()) && user_pw.equals(vo.getUser_pw())) {
                                                Toast.makeText(UmbLoginActivity.this,
                                                        user_id+"님 자동로그인 입니다.",
                                                        Toast.LENGTH_SHORT).show();
                                                Intent intent2 = new Intent(UmbLoginActivity.this, UmbMainActivity.class);

                                                intent.putExtra("response", response);

                                                startActivity(intent2);
                                            }
                                        }

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }


                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(UmbLoginActivity.this,
                                        "Login Fail" + error.toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                ) {
                    @NonNull
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> param = new HashMap<>();

                        param.put("user_id", edtId.getText().toString());
                        param.put("user_pw", edtPw.getText().toString());

                        return param;
                    }
                };


                request.setRetryPolicy(new RetryPolicy() {
                    @Override
                    public int getCurrentTimeout() {
                        return 50000;
                    }

                    @Override
                    public int getCurrentRetryCount() {
                        return 50000;
                    }

                    @Override
                    public void retry(VolleyError error) throws VolleyError {

                    }
                });


                queue.add(request);
            }
        });

    }

}