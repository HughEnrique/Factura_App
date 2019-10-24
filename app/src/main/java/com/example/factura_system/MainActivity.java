package com.example.factura_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_nit, et_factura, et_estudiante, et_cliente, et_fecha, et_prod_descripcion, et_prod_cantidad, et_prod_precio;
    private Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nit = (EditText)findViewById(R.id.et_nit);
        et_factura = (EditText)findViewById(R.id.et_factura);
        et_estudiante = (EditText)findViewById(R.id.et_estudiante);
        et_cliente = (EditText)findViewById(R.id.et_cliente);
        et_fecha = (EditText)findViewById(R.id.et_fecha);
        et_prod_descripcion = (EditText)findViewById(R.id.et_prod_descripcion);
        et_prod_cantidad = (EditText)findViewById(R.id.et_prod_cantidad);
        et_prod_precio = (EditText)findViewById(R.id.et_prod_precio);
        btn_calcular = (Button)findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("nit", et_nit.getText().toString());
                i.putExtra("factura", et_factura.getText().toString());
                i.putExtra("estudiante", et_estudiante.getText().toString());
                i.putExtra("cliente", et_cliente.getText().toString());
                i.putExtra("fecha", et_fecha.getText().toString());
                i.putExtra("prodDescripcion", et_prod_descripcion.getText().toString());
                i.putExtra("prodCantidad", et_prod_cantidad.getText().toString());
                i.putExtra("prodPrecio", et_prod_precio.getText().toString());
                startActivity(i);
            }
        });
    }
}
