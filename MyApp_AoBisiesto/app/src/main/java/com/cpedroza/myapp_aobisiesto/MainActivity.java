package com.cpedroza.myapp_aobisiesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText campoAño;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoAño = findViewById(R.id.etxtnombre);
    }

    public void onClick(View view) {
        if(view.getId()== R.id.btnEnviar){
            this.enviarDatos();
        }


    }

    public void enviarDatos(){
        String año = campoAño.getText().toString();

        if(!año.isEmpty()){
            Intent intent = new Intent(this, MA_Receptor.class);
            intent.putExtra("an",año);
            //el intent.putExtra traslada la información a la otra actividad por medio de una clave ""
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"Campo vacío",Toast.LENGTH_SHORT).show();
        }

    }
}