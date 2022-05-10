package com.example.umgrade;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
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
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class JoinActivity extends AppCompatActivity{

    CheckBox ckAllCheck, ckTerms, ckPersonal, ckMarketing;
    EditText edtJoinId, edtJoinPw,edtJoinPwCheck, edtJoinName, edtJoinNick, edtJoinEmail, edtJoinPhone, edtJoinAddr;
    Button btnJoin;

    RequestQueue queue;
    StringRequest request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        edtJoinId = findViewById(R.id.edtJoinPw);
        edtJoinPw = findViewById(R.id.edtJoinName);
        edtJoinPwCheck = findViewById(R.id.edtJoinPwCheck);
        edtJoinName = findViewById(R.id.edtJoinName);
        edtJoinNick = findViewById(R.id.edtJoinNick);
        edtJoinEmail = findViewById(R.id.edtJoinEmail);
        edtJoinPhone = findViewById(R.id.edtJoinPhone);
        edtJoinAddr = findViewById(R.id.edtJoinAddr);

        ckAllCheck = (CheckBox) findViewById(R.id.ckAllCheck);
        ckTerms = (CheckBox) findViewById(R.id.ckTerms);
        ckPersonal = (CheckBox) findViewById(R.id.ckPersonal);
        ckMarketing = (CheckBox) findViewById(R.id.ckMarketing);

        btnJoin = findViewById(R.id.btnJoin);

        queue = Volley.newRequestQueue(JoinActivity.this);

        // 체크박스 기본 상태(체크 안 됨)
        ckAllCheck.setChecked(false);
        ckTerms.setChecked(false);
        ckPersonal.setChecked(false);
        ckMarketing.setChecked(false);

        // AllCheck 값이 true일 때 전체 Check 값이 true, false면 전체 값도 false
        ckAllCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ckAllCheck.isChecked() == true) {
                    ckTerms.setChecked(true);
                    ckPersonal.setChecked(true);
                    ckMarketing.setChecked(true);
                } else if (ckAllCheck.isChecked() == false) {
                    ckTerms.setChecked(false);
                    ckPersonal.setChecked(false);
                    ckMarketing.setChecked(false);
                }
                // 조건 충족 시 버튼 활성화
                if (ckTerms.isChecked() && ckPersonal.isChecked()) {
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()) {
                    btnJoin.setClickable(false);
                    btnJoin.setBackgroundColor(Color.parseColor("#B9B7BD"));
                    btnJoin.setTextColor(Color.parseColor("#888888"));
                }
            }
        });

        ckTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ckTerms.isChecked() == false) {
                    ckAllCheck.setChecked(false);
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()) {
                    ckAllCheck.setChecked(true);
                }

                if (ckTerms.isChecked() && ckPersonal.isChecked()) {
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()) {
                    btnJoin.setClickable(false);
                    btnJoin.setBackgroundColor(Color.parseColor("#B9B7BD"));
                    btnJoin.setTextColor(Color.parseColor("#888888"));
                }
            }
        });

        ckPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ckPersonal.isChecked() == false) {
                    ckAllCheck.setChecked(false);
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()) {
                    ckAllCheck.setChecked(true);
                }

                if (ckTerms.isChecked() && ckPersonal.isChecked()) {
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()) {
                    btnJoin.setClickable(false);
                    btnJoin.setBackgroundColor(Color.parseColor("#B9B7BD"));
                    btnJoin.setTextColor(Color.parseColor("#888888"));
                }
            }
        });

        ckMarketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ckMarketing.isChecked() == false) {
                    ckAllCheck.setChecked(false);
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()) {
                    ckAllCheck.setChecked(true);
                }
            }
        });

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((edtJoinPw.getText().toString().equals(edtJoinPwCheck.getText().toString()))) {

                    Log.d("pw", edtJoinPw.getText().toString());
                    Log.d("pwcheck", edtJoinPwCheck.getText().toString());
                    Log.d("id", edtJoinId.getText().toString());
                    Log.d("name", edtJoinName.getText().toString());
                    Log.d("nick", edtJoinNick.getText().toString());
                    Log.d("email", edtJoinEmail.getText().toString());
                    Log.d("addr", edtJoinAddr.getText().toString());
                    Log.d("phone", edtJoinPhone.getText().toString());

                    Toast.makeText(JoinActivity.this,
                            "비밀번호 일치",
                            Toast.LENGTH_SHORT).show();
                    int method = Request.Method.POST;
                    String server_url = "http://220.80.203.18:8081/myapp/Join";

                    request = new StringRequest(
                            method,
                            server_url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    Toast.makeText(JoinActivity.this,
                                            "회원가입 성공!",
                                            Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(JoinActivity.this, LoginActivity.class);

                                    startActivity(intent);

                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    Toast.makeText(JoinActivity.this,
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
                
                else {
                    Toast.makeText(JoinActivity.this,
                            "비밀번호가 일치 하지 않습니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


