package com.example.rityan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rityan.classes.BottomNavigationBar;
import com.example.rityan.databinding.ActivityMainBinding;
import com.example.rityan.databinding.BottomTabLayoutBinding;
import com.example.rityan.logInScreen.LoginActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding=null;
    BottomNavigationBar bottomNavigationBar;
    BottomTabLayoutBinding tabLayoutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setContentView(mainBinding.getRoot());


        bottomNavigationBar = new BottomNavigationBar(false, true, true, true, true, true, false, false, false, false, this, new BottomNavigationBar.OnClickListener() {
            @Override
            public void OnClick(int id) {
                switch (id){
                    case 1:
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, ""+2, Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        Intent i = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(i);
                        break;

                }
            }
        });
        tabLayoutBinding = bottomNavigationBar.getBinding(getApplicationContext());
        mainBinding.linearLayout.addView(tabLayoutBinding.getRoot());
    }
}