package com.example.umb_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.umb_project.info.UserInfo;
import com.example.umb_project.vo.User;

public class UmbMypageActivity extends AppCompatActivity {

    TextView infoId, infoName, infoNick, infoEmail, infoPhone,
            infoJoindate, infoAddr, infoType, infoStatus, infoPoint;

    RequestQueue queue;
    StringRequest request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_mypage);

        infoId = findViewById(R.id.infoId);
        infoName = findViewById(R.id.infoName);
        infoNick = findViewById(R.id.infoNick);
        infoEmail = findViewById(R.id.infoEmail);
        infoPhone = findViewById(R.id.infoPhone);
        infoJoindate = findViewById(R.id.infoJoindate);
        infoAddr = findViewById(R.id.infoAddr);
        infoType = findViewById(R.id.infoType);
        infoStatus = findViewById(R.id.infoStatus);
        infoPoint = findViewById(R.id.infoPoint);

        queue = Volley.newRequestQueue(UmbMypageActivity.this);



    }
}