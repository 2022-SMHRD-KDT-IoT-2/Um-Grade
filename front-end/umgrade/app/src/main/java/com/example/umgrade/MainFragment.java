package com.example.umgrade;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainFragment extends Fragment {
    Button btnFare;
    ImageView imgMypageProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        btnFare = view.findViewById(R.id.btnFare);


        imgMypageProfile = (ImageView) view.findViewById(R.id.imgMypageProfile);
        Glide.with(this).load(R.drawable.umbrella).circleCrop().into(imgMypageProfile);

        // 로그인 시 btnFare에 "오늘까지의 UM-CYCLE 이용 요금은 n,nnn원 입니다." 출력
        btnFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 요금 안내 페이지로 이동
            }
        });

        return view;
    }
}