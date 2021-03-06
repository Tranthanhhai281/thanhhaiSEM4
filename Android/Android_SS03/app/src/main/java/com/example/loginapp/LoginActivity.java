package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edUser;
    private EditText edPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d("TAG","onCreate");
        edUser = (EditText) findViewById(R.id.edUser);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Log.i("TAG","onClick");
                onLogin();
                break;
            default:
                break;
        }
    }

    private void onLogin(){
        if (edUser.getText().toString().isEmpty() || edPassword.getText().toString().isEmpty()){
            Toast.makeText(this,"Bạn chưa nhập User Name hoặc Pass word",Toast.LENGTH_SHORT).show();

        }else {
            Intent intent = new Intent(this,ProfileActivity.class);
            intent.putExtra("USER_NAME",edUser.getText().toString());
            startActivity(intent);
        }
    }
}
