package com.example.umb_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.umb_project.info.UserInfo;
import com.example.umb_project.vo.User;

import net.daum.mf.map.api.MapView;

public class UmbMainActivity extends AppCompatActivity  {

    TextView tvUser1, tvUserPoint2;
    Button btnMypage, btnLogout;
    //MapView mapView;
    RequestQueue queue;
    StringRequest request;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_main);

        tvUser1 = findViewById(R.id.tvUser1);
        tvUserPoint2 = findViewById(R.id.tvUserPoint2);
        btnMypage = findViewById(R.id.btnMypage);
        btnLogout = findViewById(R.id.btnLogout);

        queue = Volley.newRequestQueue(UmbMainActivity.this);

        //MapView mapView = new MapView(this);

        //ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.mapView);
        //mapViewContainer.addView(mapView);



        int method = Request.Method.POST;
        String server_url = "http://220.71.97.131:8081/myapp/Login";

        request = new StringRequest(
                method,
                server_url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        User user = UserInfo.info;
                        tvUser1.setText(user.getUser_id());
                        tvUserPoint2.setText(user.getUser_point());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(UmbMainActivity.this,
                                "" + error.toString(),
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
        queue.add(request);

        btnMypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                intent.getStringExtra("response");

                int method = Request.Method.POST;
                String server_url = "http://220.71.97.131:8081/myapp/Login";

                request = new StringRequest(
                        method,
                        server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                Intent intent2 = new Intent(UmbMainActivity.this, UmbMypageActivity.class);

                                intent2.putExtra("response", response);

                                startActivity(intent2);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(UmbMainActivity.this,
                                        "" + error.toString(),
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                queue.add(request);
            }
        });
    }

}