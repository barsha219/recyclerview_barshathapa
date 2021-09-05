package com.example.recyclerview_barshathapa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class country_details extends AppCompatActivity {

    TextView cname, areaa, rel, pop, details, anim, bird, returnhome;
    ImageView flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countrydetails);

        cname = findViewById(R.id.cname);
        areaa = findViewById(R.id.areaa);
        rel = findViewById(R.id.rel);
        pop = findViewById(R.id.pop);
        details = findViewById(R.id.details);
        anim = findViewById(R.id.anim);
        bird = findViewById(R.id.bird);
        flag = findViewById(R.id.flag);
        returnhome = findViewById(R.id.returnhome);

        flag.setImageResource(getIntent().getIntExtra("flagID", 0));
        cname.setText(getIntent().getStringExtra("cnameID"));
        areaa.setText(getIntent().getStringExtra("areaID"));
        rel.setText(getIntent().getStringExtra("relID"));
        pop.setText(getIntent().getStringExtra("popID"));
        details.setText(getIntent().getStringExtra("detID"));
        anim.setText(getIntent().getStringExtra("animID"));
        bird.setText(getIntent().getStringExtra("birdID"));

        returnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(country_details.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }

}
