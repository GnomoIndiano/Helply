package br.unicamp.helply;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cadastro2 extends AppCompatActivity {
    ImageButton av1, av2, av3, av4, av5, av6, av7, av8, av9, av10, av11, av12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        av1 = (ImageButton) findViewById(R.id.avatar1);
        av2 = (ImageButton) findViewById(R.id.avatar2);
        av3 = (ImageButton) findViewById(R.id.avatar3);
        av4 = (ImageButton) findViewById(R.id.avatar4);
        av5 = (ImageButton) findViewById(R.id.avatar5);
        av6 = (ImageButton) findViewById(R.id.avatar6);
        av7 = (ImageButton) findViewById(R.id.avatar7);
        av8 = (ImageButton) findViewById(R.id.avatar8);
        av9 = (ImageButton) findViewById(R.id.avatar9);
        av10 = (ImageButton) findViewById(R.id.avatar10);
        av11 = (ImageButton) findViewById(R.id.avatar11);
        av12 = (ImageButton) findViewById(R.id.avatar12);


        av1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 1);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 2);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 3);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 4);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 5);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 5);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 6);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 7);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 8);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 9);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 10);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 11);
                intent.putExtras(params);
                startActivity(intent);
            }
        });

        av12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Bundle params =  intent.getExtras();
                intent = new Intent(Cadastro2.this, Cadastro3.class);
                params.putInt("sessaoAvatar", 12);
                intent.putExtras(params);
                startActivity(intent);
            }
        });
    }
}