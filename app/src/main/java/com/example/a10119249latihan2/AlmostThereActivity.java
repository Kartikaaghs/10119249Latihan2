package com.example.a10119249latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almosthere);
        Button veri = (Button) findViewById(R.id.veri);
        veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AlmostThereActivity.this,VerifyAccActivity.class);
                startActivity(intent);
            }
        });
    }
}
