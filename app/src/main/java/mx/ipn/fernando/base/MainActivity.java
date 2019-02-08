package mx.ipn.fernando.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.nombre);
    }

    public void  guardar(View v){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("nombre", nombre.getText().toString().trim());
        finish();
        startActivity(i);
    }
}
