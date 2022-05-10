package com.example.umgrade;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class JoinActivity extends AppCompatActivity{

    CheckBox ckAllCheck, ckTerms, ckPersonal, ckMarketing;
    Button btnJoin;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        ckAllCheck = (CheckBox) findViewById(R.id.ckAllCheck);
        ckTerms = (CheckBox) findViewById(R.id.ckTerms);
        ckPersonal = (CheckBox) findViewById(R.id.ckPersonal);
        ckMarketing = (CheckBox) findViewById(R.id.ckMarketing);

        btnJoin = findViewById(R.id.btnJoin);

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
                if (ckTerms.isChecked() && ckPersonal.isChecked()){
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()){
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
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()){
                    ckAllCheck.setChecked(true);
                }

                if (ckTerms.isChecked() && ckPersonal.isChecked()){
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()){
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
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()){
                    ckAllCheck.setChecked(true);
                }

                if (ckTerms.isChecked() && ckPersonal.isChecked()){
                    btnJoin.setClickable(true);
                    btnJoin.setBackgroundColor(Color.parseColor("#2196F3"));
                    btnJoin.setTextColor(Color.WHITE);
                } else if (!ckTerms.isChecked() || !ckPersonal.isChecked()){
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
                } else if (ckTerms.isChecked() && ckPersonal.isChecked() && ckMarketing.isChecked()){
                    ckAllCheck.setChecked(true);
                }
            }
        });

    }
}