package com.example.numeroprimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_numero;
    Button btn_verificar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero = (EditText) findViewById(R.id.et_numero);
        btn_verificar = (Button) findViewById(R.id.btn_verificar);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btn_verificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int valor = Integer.parseInt(et_numero.getText().toString()), cont = 0, i = 1;

                while (i <= valor){
                    if (valor % i == 0){
                        cont++;
                    }

                    i++;
                }

                if (cont == 2){
                    txtResultado.setText("O número" + " " + valor + " " + "é primo.");
                    et_numero.setText("");
                } else {
                    txtResultado.setText("O número" + " " + valor + " " + "não é primo.");
                    et_numero.setText("");
                }
            }
        });
    }
}