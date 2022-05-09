package com.example.umgrade;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtLoginId, edtLoginPw;
    TextView tvJoin;

    RequestQueue queue;
    StringRequest request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 초기화
        btnLogin = findViewById(R.id.btnLogin);
        edtLoginId = findViewById(R.id.edtLoginId);
        edtLoginPw = findViewById(R.id.edtLoginPw);
        tvJoin = findViewById(R.id.tvJoin);

        queue = Volley.newRequestQueue(LoginActivity.this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int method = Request.Method.POST;
                // 서버 url
                String server_url = "";

                request = new StringRequest(
                        method,
                        server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                Toast.makeText(LoginActivity.this,
                                        "로그인 성공 > "+response,
                                        Toast.LENGTH_SHORT).show();
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(LoginActivity.this,
                                        "로그인 실패 > "+error.toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                ){
                    // POST 방식으로 데이터 전송
                    @Nullable
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> param = new HashMap<>();
                        param.put("id", edtLoginId.getText().toString());
                        param.put("pw", edtLoginPw.getText().toString());
                        return param;
                    }
                };
                queue.add(request);
            }
        });

        // 회원가입 클릭 시 화면전환
        tvJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, JoinActivity.class);
                
                startActivity(intent);
            }
        });
    }
}