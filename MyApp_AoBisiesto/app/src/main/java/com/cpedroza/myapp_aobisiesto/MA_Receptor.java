package com.cpedroza.myapp_aobisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MA_Receptor extends AppCompatActivity {
private TextView cAño, cMeses, cSemanas, cDias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_receptor);
        cAño= findViewById(R.id.txtAño);
        cMeses = findViewById(R.id.txtMeses);
        cSemanas = findViewById(R.id.txtSemanas);
        cDias = findViewById(R.id.txtDias);
        this.obtener();
    }


    public void obtener(){
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String año = bundle.getString("an");
            año = bundle.getString("an");
            int num = Integer.parseInt(año);
            if( num % 400 == 0 && num % 100 == 0){

                cAño.setText("El "+año+" SI es BISIESTO");
                cMeses.setText("Meses 12");
                cSemanas.setText("Semanas 52");
                cDias.setText("Días 366");
            }else {
                cAño.setText("El "+año+" NO es BISIESTO");
                cMeses.setText("Meses 12");
                cSemanas.setText("Semanas 52");
                cDias.setText("Dias 365");
            }

        }
        else {
            cAño.setText("No se encontró la Información");
        }

    }
}