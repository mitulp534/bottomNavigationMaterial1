package com.example.hp.com.bottomnavigationmaterial1;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private static final String TAG="MainActivity";
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }
    Account accountFragment = new Account();
    Favourite favouriteFragment = new Favourite();
    Home homeFragment = new Home();
    Cart cartFragment = new Cart();
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
       switch(menuItem.getItemId()){
           case R.id.navigation_home:
               getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in,R.anim.fade_out).replace(R.id.container,homeFragment).commit();
               return true;
           case R.id.navigation_cart:
               getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in,R.anim.fade_out).replace(R.id.container,cartFragment).commit();
               return true;
           case R.id.navigation_favourite:
               getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in,R.anim.fade_out).replace(R.id.container,favouriteFragment).commit();
               return true;
           case R.id.navigation_userProfile:
               getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fade_in,R.anim.fade_out).replace(R.id.container,accountFragment).commit();
               return true;
       }
        return false;
    }
}
