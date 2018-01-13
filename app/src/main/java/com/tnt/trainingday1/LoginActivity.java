package com.tnt.trainingday1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    String trueUsername = "user";
    String truePassword = "123";

    @BindView(R.id.edt_username)
    EditText edtUsername;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {

        //Mengambil dari edit text
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        //validasi username dan password yang diinput
        if (username.equals(trueUsername) && password.equals(truePassword)){
            Toast.makeText(this, "Username Password benar !", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Username Password salah !", Toast.LENGTH_SHORT).show();

        }

    }
}
