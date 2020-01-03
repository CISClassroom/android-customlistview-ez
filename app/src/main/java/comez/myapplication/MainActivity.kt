package comez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf(
            "OOP", "JAVA", "KOTLIN"
        )
        // data -> Adapter -> View. listview
        val mylistview = findViewById<ListView>(R.id.mylistview)
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, name)
        mylistview.adapter = arrayAdapter // as ListAdapter
    }
}
