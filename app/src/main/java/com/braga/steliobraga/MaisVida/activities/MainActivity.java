package com.braga.steliobraga.MaisVida.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.button.MaterialButton;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.braga.steliobraga.MaisVida.fragments.ChatFragment;
import com.braga.steliobraga.MaisVida.fragments.ContaFragment;
import com.braga.steliobraga.MaisVida.R;
import com.braga.steliobraga.MaisVida.fragments.HomeFragment;
import com.braga.steliobraga.MaisVida.utils.MyUtils;


public class MainActivity extends AppCompatActivity {

    int fl_framelayout;
    BottomNavigationView main_nav;
    FragmentManager fragmentManager;

    // Fragments
    HomeFragment homeFragment;
    ChatFragment chatFragment;
    ContaFragment contaFragment;
    MaterialButton btn_anuncio;


    final Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        btn_anuncio=findViewById(R.id.btn_anuncio);
        main_nav = findViewById(R.id.main_nav);
        fl_framelayout = R.id.fl_framelayout;



        // Fragment init
        homeFragment  = new HomeFragment();
        chatFragment  = new ChatFragment();
        contaFragment = new ContaFragment();


        btn_anuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // Select by default:
        main_nav.setSelectedItemId(R.id.home_item);
        MyUtils.changeFragment(fl_framelayout, homeFragment, fragmentManager);



        main_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_item:
                        MyUtils.changeFragment(fl_framelayout, homeFragment, fragmentManager);
                        break;

                    case R.id.chat_item:
                        MyUtils.changeFragment(fl_framelayout, chatFragment, fragmentManager);
                        break;

                   case R.id.profile_item:
                        MyUtils.changeFragment(fl_framelayout, contaFragment, fragmentManager);
                        break;
                }
                return true;
            }
        });
    }

}