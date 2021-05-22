package com.nurayim.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text_title;
    ImageView imageView;
    boolean isCat;
    boolean isDog;
    boolean isRabbit;
    Button cat, dog, rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initButtons();

    }


    private void initButtons() {
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_title.setText("Это кошка");
                if (isCat) {
                    Toast.makeText(MainActivity.this, "правильно", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_LONG);

                }

            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_title.setText("Это собака ");
                if (isDog) {
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Это не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_title.setText("Это заяц");

                if (isRabbit) {

                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Это не правильно", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    //метод getId- имеет в виду достань все пойди
    @SuppressLint("NonConstantResourceId")
    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.number_of_btn:
                imageView.setImageResource(R.drawable.cat);
                isCat = true;
                isDog = false;
                isRabbit = false;
                break;
            case R.id.number_of_btn2:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isRabbit = false;
                break;
            case R.id.number_of_btn3:
                imageView.setImageResource(R.drawable.rabbit);
                isRabbit = true;
                isCat = false;
                isDog = false;
                break;
        }
    }

    private void initView() {
        text_title = findViewById(R.id.title_of_picture);
        imageView = findViewById(R.id.im_different_picture);
        cat = findViewById(R.id.cat);
        dog = findViewById(R.id.dog);
        rabbit = findViewById(R.id.rabbit);


    }
}