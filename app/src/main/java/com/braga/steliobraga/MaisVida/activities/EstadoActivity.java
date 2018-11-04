package com.braga.steliobraga.MaisVida.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.braga.steliobraga.MaisVida.R;
import com.braga.steliobraga.MaisVida.fragments.MeusaunciosFragment;
import com.braga.steliobraga.MaisVida.fragments.NotificationFragment;
import com.braga.steliobraga.MaisVida.utils.MyUtils;

public class EstadoActivity extends AppCompatActivity {

    int fl_framelayout;
    BottomNavigationView estado_nav;
    FragmentManager fragmentManager;

    // Fragments
    NotificationFragment notificationFragament;
    MeusaunciosFragment meusaunciosFragment;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estados);


        estado_nav = findViewById(R.id.estado_nav);
       // chatFragment = new ChatFragment();
        notificationFragament = new NotificationFragment();
        meusaunciosFragment = new MeusaunciosFragment();

        // Select by default:
        estado_nav.setSelectedItemId(R.id.home_item);
        MyUtils.changeFragment(fl_framelayout, notificationFragament, fragmentManager);



        estado_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.notification_item:
                    MyUtils.changeFragment(fl_framelayout,notificationFragament, fragmentManager);
                    break;

                case R.id.anuncios_item:
                   MyUtils.changeFragment(fl_framelayout,meusaunciosFragment , fragmentManager);
                    break;


            }
            return true;
        }
    });
}

}
