package com.example.bm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_Korean;
    private Button btn_Pizza;
    private Button btn_Popular1;
    private Button btn_Popular2;
    private Button btn_Chicken;
    private Button btn_Chinese;
    private Button btn_Japanese;
    private Button btn_SnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Korean = findViewById(R.id.btn_Korean);
        btn_Chinese = findViewById(R.id.btn_Chinese);
        btn_Chicken = findViewById(R.id.btn_Chicken);
        btn_Japanese = findViewById(R.id.btn_Japanese);
        btn_Pizza = findViewById(R.id.btn_Pizza);
        btn_SnackBar = findViewById(R.id.btn_SnackBar);
        btn_Popular1 = findViewById(R.id.btn_Popular1);
        btn_Popular2 = findViewById(R.id.btn_Popular2);

        btn_Korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent korean_menu = new Intent(MainActivity.this, activity_KoreanList.class);
                startActivity(korean_menu);
            }
        });

        btn_Chinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chinese_menu = new Intent(MainActivity.this, activity_ChineseList.class);
                startActivity(chinese_menu);
            }
        });

        btn_Chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chicken_menu = new Intent(MainActivity.this, activity_ChickenList.class);
                startActivity(chicken_menu);
            }
        });

        btn_Japanese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent japanese_menu = new Intent(MainActivity.this, Japanese.class);
                startActivity(japanese_menu);
            }
        });

        btn_Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pizza_menu = new Intent(MainActivity.this, activity_PizzaList.class);
                startActivity(pizza_menu);
            }
        });

        btn_SnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snackBar_menu = new Intent(MainActivity.this, activity_SnackBarList.class);
                startActivity(snackBar_menu);
            }
        });

        btn_Popular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popular1_menu = new Intent(MainActivity.this, Popular1.class);
                startActivity(popular1_menu);
            }
        });

        btn_Popular2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popular2_menu = new Intent(MainActivity.this, Popular2.class);
                startActivity(popular2_menu);
            }
        });



    }
}
