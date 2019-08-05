package com.example.muvi;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_movie:
                    //Fragment initialization
                    MovieFragment movieFragment = new MovieFragment();
                    //Fragment Transaction
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_content, movieFragment);
                    fragmentTransaction.commit();
                    return true;

                case R.id.navigation_tvshow:
                    //Fragment initialization
                    TvShowFragment tvShowFragment = new TvShowFragment();
                    //Fragment Transaction
                    FragmentTransaction fragmentTvShowTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTvShowTransaction.replace(R.id.fragment_content, tvShowFragment);
                    fragmentTvShowTransaction.commit();
                    return true;

                case R.id.navigation_setting:
                    //Fragment initialization
                    SettingFragment  settingFragment = new SettingFragment();
                    //Fragment Transaction
                    FragmentTransaction fragmentSettingTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentSettingTransaction.replace(R.id.fragment_content, settingFragment);
                    fragmentSettingTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment initialization
        MovieFragment movieFragment = new MovieFragment();
        //Fragment Transaction
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_content, movieFragment);
        fragmentTransaction.commit();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
