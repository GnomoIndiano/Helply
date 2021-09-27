package br.unicamp.helply;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro1 extends AppCompatActivity {
    Button btnSeguinte;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro1);

        btnSeguinte = (Button) findViewById(R.id.btnSeguinte);
        edtNome = (EditText) findViewById(R.id.edtNome);

        btnSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNome.getText().toString() == "Nome")
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Cadastro1.this);
                    builder.setCancelable(true);
                    builder.setTitle("Campos em branco");
                    builder.setMessage("Preencha todos os campos");
                    builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }});

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }});

                    builder.show();
                }
                else {

                    Intent intent = new Intent(Cadastro1.this, Cadastro2.class);

                    Bundle params = new Bundle();
                    params.putString("sessaoNome", edtNome.getText().toString());

                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        });
    }
}