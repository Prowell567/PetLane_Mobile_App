package com.example.semi_final.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.semi_final.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



        bottom_navigation();
    }

    private void bottom_navigation() {
        LinearLayout home, cart, orders, profile;

        home = findViewById(R.id.btnHome);
        cart = findViewById(R.id.btnCart);
        //orders = findViewById(R.id.btnOrders);
        profile = findViewById(R.id.btnProfile);

        home.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, HomePageActivity.class)));
        cart.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
        //orders.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, OrdersActivity.class)));
        profile.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
    }
}