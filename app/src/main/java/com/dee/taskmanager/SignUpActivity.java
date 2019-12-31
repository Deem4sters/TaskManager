package com.dee.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {
ImageView imageView;
Button btnSignUp;
EditText etUsername, etFirstName, etLastName, etPassword, etCPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


imageView = findViewById(R.id.imageView);
btnSignUp = findViewById(R.id.btnSignUp);
etUsername = findViewById(R.id.etUsername);
etFirstName = findViewById(R.id.etFirstName);
etLastName = findViewById(R.id.etLastName);
etPassword = findViewById(R.id.etPassword);
etCPassword = findViewById(R.id.CPassword);

imageView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

    }
    private void Browse
}
