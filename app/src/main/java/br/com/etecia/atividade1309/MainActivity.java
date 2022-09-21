package br.com.etecia.atividade1309;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.filament.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    CoffeFragment coffeFragment = new CoffeFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    TeaFragment teaFragment = new TeaFragment();
    DonutsFragment donutsFragment = new DonutsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btnNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, coffeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.ic_coffe:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, coffeFragment).commit();
                        return true;

                    case R.id.ic_muffin:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, muffinFragment).commit();
                        return true;

                    case R.id.ic_tea:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, teaFragment).commit();
                        return true;

                    case R.id.ic_donuts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, donutsFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }

    public void nextTela(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer, fragment).commit();

    }
}