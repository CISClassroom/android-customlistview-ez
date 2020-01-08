package comez.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import comez.myapplication.Adapter.StudentAdapter
import comez.myapplication.Model.Student
import comez.myapplication.wannaphong.Wannaphong

class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var student:Student = Student("Wannaphong Phatthiyaphaibun","603410214-3",R.drawable.wannaphong)

        var students = mutableListOf<Student>()

        students.add(student)
        students.add(Student("Mark,""00",R.mipmap.ic_launcher))
        students.add(Student("Sirinat,""00",R.mipmap.ic_launcher))

        var listview:ListView = findViewById(R.id.customlistview)

        listview.adapter = StudentAdapter(this,
            R.layout.listitem_student,students)

        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if(position==0){
                var i = Intent(this,Wannaphong::class.java)
                startActivity(i)
            }
            else if(position==1){
                var i = Intent(this,mark::class.java)
                startActivity(i)
            }
            else if(position==2){
                var i = Intent(this,SirinatActivity::class.java)
                startActivity(i)
            }

        }
    }
}
