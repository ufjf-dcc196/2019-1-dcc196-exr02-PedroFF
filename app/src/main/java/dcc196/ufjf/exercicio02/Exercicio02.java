package dcc196.ufjf.exercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercicio02 extends AppCompatActivity {

    Button btn_soma;
    Button btn_subtrai;
    Button btn_multiplica;
    Button btn_divide;
    TextView primeiro_numero;
    TextView segundo_numero;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02);
        resultado = findViewById(R.id.resultado);
        btn_soma =  findViewById(R.id.btn_soma);
        primeiro_numero =  findViewById(R.id.primeiro_numero);
        segundo_numero =  findViewById(R.id.segundo_numero);

        btn_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soma = Integer.parseInt(primeiro_numero.getText().toString()) + Integer.parseInt(segundo_numero.getText().toString());
                resultado.setText("Resultado: " + soma);
            }
        });
    }
}
