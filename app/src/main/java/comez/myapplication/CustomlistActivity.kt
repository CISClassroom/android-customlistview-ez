package comez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import comez.myapplication.Adapter.StudentAdapter
import comez.myapplication.Model.Student

class CustomlistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customlist)

        var student: Student = Student("suaty", "001", R.mipmap.ic_launcher)
        var students = mutableListOf<Student>()

        students.add(student)
        students.add(Student("mark", "002", R.mipmap.ic_launcher))

        var listView: ListView = findViewById(R.id.customlistView)
        listView.adapter = StudentAdapter(this, R.layout.listitem_student, students)

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this, position.toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}



