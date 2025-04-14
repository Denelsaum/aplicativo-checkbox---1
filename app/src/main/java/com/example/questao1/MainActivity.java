package com.example.questao1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cbArroz, cbLeite, cbCarne, cbFeijao, cbRefri;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbArroz = findViewById(R.id.cb_arroz);
        cbLeite = findViewById(R.id.cb_leite);
        cbCarne = findViewById(R.id.cb_carne);
        cbFeijao = findViewById(R.id.cb_feijao);
        cbRefri = findViewById(R.id.cb_refri);
        btnCalcular = findViewById(R.id.btn_calcular);
        tvResultado = findViewById(R.id.tv_resultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double total = 0;

                if (cbArroz.isChecked()) total += 2.69;
                if (cbLeite.isChecked()) total += 2.70;
                if (cbCarne.isChecked()) total += 16.70;
                if (cbFeijao.isChecked()) total += 3.38;
                if (cbRefri.isChecked()) total += 3.00;

                tvResultado.setText("Total da compra: R$ " + String.format("%.2f", total));
            }
        });
    }
}
