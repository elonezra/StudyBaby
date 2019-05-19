package com.example.elon.studybaby.loginPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.elon.studybaby.R;

public class MainActivityLoginScreen extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button signUp;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Name = (EditText)findViewById(R.id.name);
        Password = (EditText)findViewById(R.id.password);
        Info = (TextView)findViewById(R.id.attemptView);
        Login = (Button)findViewById(R.id.signInBTN);
        signUp = (Button)findViewById(R.id.signUpBTN);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
    if((userName.equals("admin"))&&(userPassword.equals("1234"))){
        Intent intent = new Intent(MainActivityLoginScreen.this, MenuActivity.class);
        startActivity(intent);
    }else{
        counter--;

        Info.setText("No of attempts remaining: " + String.valueOf(counter));

        if(counter == 0){
            Login.setEnabled(false);

            Info.setText("Amount of login attempts exceeded!");
        }
    }
    }
}
