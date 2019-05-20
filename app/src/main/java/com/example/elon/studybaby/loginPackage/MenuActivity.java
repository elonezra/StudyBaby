package com.example.elon.studybaby.loginPackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.elon.studybaby.R;

public class MenuActivity extends AppCompatActivity {
    private Button tableCreate;
    private Button tableJoin;
    private Button userProfile;
    private TextView greetingInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);


        String s= getIntent().getStringExtra("username");


        tableCreate = (Button)findViewById(R.id.tablecreate);
        tableJoin = (Button)findViewById(R.id.jointable);
        userProfile = (Button)findViewById(R.id.userprofile);
        greetingInfo = (TextView) findViewById(R.id.greetingInfo);

        greetingInfo.setText("Hello " + s + "!");

        tableJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, tableSearch.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"help",Toast.LENGTH_SHORT).show();
            }
        });





    }
}
