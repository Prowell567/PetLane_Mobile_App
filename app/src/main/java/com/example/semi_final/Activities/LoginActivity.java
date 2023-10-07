package com.example.semi_final.Activities;

import androidx.appcompat.app.AppCompatActivity;
import java.net.URL;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.semi_final.R;

public class LoginActivity extends AppCompatActivity {
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        super.onCreate(savedInstanceState);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Send http
                //nahid.gamer42@gmail.com
            }
        });
    }
}