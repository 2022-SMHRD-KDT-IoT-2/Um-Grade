package com.example.umgrade;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    MainFragment frag_main;
    CommuFragment frag_commu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottomNav);

        frag_main = new MainFragment();
        frag_commu = new CommuFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, frag_main).commit();

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.fragMain){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, frag_main).commit();
                } else if (itemId == R.id.fragCommu){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, frag_commu).commit();
                }

                return true;
            }
        });

    }
}