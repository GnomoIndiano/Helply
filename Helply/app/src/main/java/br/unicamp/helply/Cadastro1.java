package br.unicamp.helply;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

import br.unicamp.helply.APIconfig.Aluno;
import br.unicamp.helply.APIconfig.RetrofitConfig;
import br.unicamp.helply.APIconfig.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Cadastro1 extends AppCompatActivity {
    Button btnSeguinte;
    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro1);

        btnSeguinte = (Button) findViewById(R.id.btnSeguinte);
        edtNome = (EditText) findViewById(R.id.edtNome);

        Service service  = RetrofitConfig.getRetrofitInstance().create(Service.class);
        Call<Aluno> call = service.getAluno(2);

/*
        call.enqueue(new Callback<Aluno>() {
            @Override
            public void onResponse(Call<Aluno> call, Response<Aluno> response) {
                if(response.isSuccessful()){
                    Toast.makeText(br.unicamp.helply.Cadastro1.this, "deu certo", Toast.LENGTH_LONG).show();
                    Aluno aluno = response.body();
                    edtNome.setText(aluno.toString());
                }else{
                    String errorMessage = response.errorBody().toString();
                    Toast.makeText(br.unicamp.helply.Cadastro1.this, errorMessage, Toast.LENGTH_LONG).show();
                    Toast.makeText(br.unicamp.helply.Cadastro1.this, "entrou no else do response", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Aluno> call, Throwable t) {
                Toast.makeText(br.unicamp.helply.Cadastro1.this, "Erro dois", Toast.LENGTH_SHORT).show();
            }
        });
*/
        //luiza
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

                    String cadastroNome = edtNome.getText().toString();
                    Aluno objAluno = new Aluno(0, cadastroNome, "", "", false, 0, 0, 0);

                    Intent intent = new Intent(Cadastro1.this, Cadastro2.class);
                    intent.putExtra("sessaoNome", (Serializable) objAluno);
                    startActivity(intent);
                    /*
                    Bundle params = new Bundle();
                    params.putString("sessaoNome", edtNome.getText().toString());
*/
                }
            }
        });
    }
}