package com.example.factura_system;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_nit, tv_factura, tv_estudiante, tv_cliente, tv_fecha, tv_descripcion, tv_cantidad, tv_precio, tv_subtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_nit = (TextView)findViewById(R.id.tv_nit);
        tv_factura = (TextView)findViewById(R.id.tv_factura);
        tv_estudiante = (TextView)findViewById(R.id.tv_estudiante);
        tv_cliente = (TextView)findViewById(R.id.tv_cliente);
        tv_fecha = (TextView)findViewById(R.id.tv_fecha);
        tv_descripcion = (TextView)findViewById(R.id.tv_descripcion);
        tv_cantidad = (TextView)findViewById(R.id.tv_cantidad);
        tv_precio = (TextView)findViewById(R.id.tv_precio);
        tv_subtotal = (TextView)findViewById(R.id.tv_subtotal);

        recibirDatos();
    }

    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String nit = extras.getString("nit");
        String factura = extras.getString("factura");
        String estudiante = extras.getString("estudiante");
        String cliente = extras.getString("cliente");
        String fecha = extras.getString("fecha");
        String descripcion = extras.getString("prodDescripcion");
        String cantidad = extras.getString("prodCantidad");
        String precio = extras.getString("prodPrecio");

        int cantidad_int = Integer.parseInt(cantidad);
        int precio_int = Integer.parseInt(precio);
        int subtotal_int = precio_int * cantidad_int;

        String subtotal = String.valueOf(subtotal_int);

        tv_nit.setText(nit);
        tv_factura.setText(factura);
        tv_estudiante.setText(estudiante);
        tv_cliente.setText(cliente);
        tv_fecha.setText(fecha);
        tv_descripcion.setText(descripcion);
        tv_cantidad.setText(cantidad);
        tv_precio.setText(precio);
        tv_subtotal.setText(subtotal);
    }
}
