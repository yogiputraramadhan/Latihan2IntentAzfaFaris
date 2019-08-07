package com.example.latihan2intentazfa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button kekedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kekedua = (Button)findViewById(R.id.kekedua);
        kekedua.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.kekedua:
            Intent kekedua = new Intent(MainActivity.this,ActivityKedua.class);
        startActivity(kekedua);
        break;
        default:
            break;
    }
    }
}
