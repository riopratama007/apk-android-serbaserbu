package com.kinikumuda.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kinikumuda.fragment.Fragment_Account;
import com.kinikumuda.fragment.Fragment_Home;
import com.kinikumuda.fragment.Fragment_Shopping;
import com.kinikumuda.serbaserbu.R;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        loadfragment(new Fragment_Home());

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.fr_home:
                fragment = new Fragment_Home();
                break;

            case R.id.fr_shopping:
                fragment = new Fragment_Shopping();
                break;

            case R.id.fr_akun:
                fragment = new Fragment_Account();
                break;

        }
        return loadfragment(fragment);

    }

    private boolean loadfragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}