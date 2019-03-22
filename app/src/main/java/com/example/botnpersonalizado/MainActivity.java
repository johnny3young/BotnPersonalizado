package com.example.botnpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnClaseAnonima);
        btn2 = findViewById(R.id.btnImplements);
        btn3 = findViewById(R.id.btnOnclick);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnClaseAnonima:
                Toast.makeText(this, "Metodo Onclick desde el botón anonimo V2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnImplements:
                Toast.makeText(this, "Metodo Onclick desde el botón implements V2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnOnclick:
                Toast.makeText(this, "Metodo Onclick V2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
