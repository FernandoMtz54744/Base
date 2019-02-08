package mx.ipn.fernando.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombre = (TextView)findViewById(R.id.nombre);

        Intent recibe = getIntent();
        String name = recibe.getStringExtra("nombre");
        nombre.setText("Nombre: " + name);
    }


}
