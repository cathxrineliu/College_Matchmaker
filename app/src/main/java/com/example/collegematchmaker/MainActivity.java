package com.example.collegematchmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterInfo = (Button) findViewById(R.id.enterInfo);
        Button colleges = (Button) findViewById(R.id.colleges);

        enterInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEnterInformation();
            }
        });

    }

    public void openEnterInformation() {
        Intent i = new Intent(this, EnterInformation.class);
        startActivity(i);
    }
}
