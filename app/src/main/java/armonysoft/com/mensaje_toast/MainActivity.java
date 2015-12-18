package armonysoft.com.mensaje_toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        //numero random
        num = (int)(Math.random()*10001);
        //de entero a string
        String cadena =  String.valueOf(num);
        //mensaje en pantalla
        Toast notificacion = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void controlar (View v) {
        String valorIngresado = et1.getText().toString();
        int valor = Integer.parseInt(valorIngresado);
        if(valor ==num){
            Toast notificacion = Toast.makeText(this,"Muy bien recordaste el numero mostrado",Toast.LENGTH_LONG);
            notificacion.show();
        }else{
            Toast notificacion = Toast.makeText(this,"Lo siento pero no es el numero que mostre.",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }



}
