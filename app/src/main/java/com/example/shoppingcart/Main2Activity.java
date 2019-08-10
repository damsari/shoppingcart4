package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    private ImageButton BtnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BtnMove = findViewById(R.id.imageButton);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivity_main2();
            }


        });


    }

    private  void moveToActivity_main2(){
        Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(intent);
    }
}