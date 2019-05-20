package com.example.elon.studybaby.loginPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.elon.studybaby.R;

public class tableSearch extends AppCompatActivity {
    private Button viaSubject;
    private Button revealAll;
    private Button viaFloor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_search);

        viaSubject = (Button) findViewById(R.id.viaSubject);
        revealAll = (Button) findViewById(R.id.revealAll);
        viaFloor = (Button) findViewById(R.id.viaFloor);

        viaSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tableSearch.this, searchBySubject.class);
                startActivity(intent);
            }
        });


    }
}
