package comez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import comez.myapplication.Adapter.StudentAdapter
import comez.myapplication.Model.Student

class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var student:Student = Student("Wannaphong","603410214-3",R.mipmap.ic_launcher)

        var students = mutableListOf<Student>()

        students.add(student)
        students.add(Student("M","02",R.mipmap.ic_launcher))

        var listview:ListView = findViewById(R.id.customlistview)

        listview.adapter = StudentAdapter(this,
            R.layout.listitem_student,students)
    }
}
