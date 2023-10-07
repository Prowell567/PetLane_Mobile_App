package com.example.semi_final.Activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.semi_final.R;

public class RegistrationActivity extends AppCompatActivity {

    private EditText cusername, cemail, cpass, creenterpass, cfname, clname, caddress, cphone;
    private SQLiteHandler db;
    private Button btncregister;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        cusername = findViewById(R.id.EditTextUsername);
        cemail = findViewById(R.id.EditTextEmail);
        cpass = findViewById(R.id.EditTextPassword);
        creenterpass = findViewById(R.id.EditTextConfirmPass);
        cfname = findViewById(R.id.EditTextFirstName);
        clname = findViewById(R.id.EditTextLastName);
        caddress = findViewById(R.id.EditTextAddress);
        cphone = findViewById(R.id.EditTextContactNo);

        btncregister = findViewById(R.id.btnCreate);

        //SQLite database handler
        db = new SQLiteHandler(getApplicationContext());
    }
}
