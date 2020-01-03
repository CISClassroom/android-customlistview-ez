package comez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf(
            "OOP", "JAVA", "KOTLIN"
        )
        val student_name = resources.getStringArray(R.array.student_name)

        // data -> Adapter -> View. listview
        val mylistview = findViewById<ListView>(R.id.mylistview)
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, student_name)
        mylistview.adapter = arrayAdapter // as ListAdapter

        mylistview.setOnItemClickListener{parent, view, position, id ->
            Log.i("hi",position.toString())
            val itemText = parent.getItemAtPosition(position) as String
            Toast.makeText(this,itemText.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
