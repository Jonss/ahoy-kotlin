package jonss.com.github.sokakarecos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView

/**
 * Created by joao on 27/07/16.
 */
class MainActivity : AppCompatActivity() {

    var lista : ListView? = null
    //private ListView lista;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Passei aqui", "Ma oe")
        lista = findViewById(R.id.lista) as ListView?


        //lista = (ListView) findViewById(R.id.lista);
    }

}