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

        var students = mutableListOf<Student>()

        students.add(Student("วรรณพงษ์ ภัททิยไพบูลย์", "603410214-3", R.drawable.wannaphong))

        students.add(Student("นายนฤเบศร์ พนะโรจน์", "603410047-6", R.drawable.pro))
        students.add(Student("สิรินาถ จริยพันธ์", "603410221-6", R.drawable.ff))

        students.add(Student("นายปาณัสม์ คำอินทร์", "603410319-9", R.drawable.phai))

        students.add(Student("นางสาวอาทิตยา ฉิมมาแก้ว", "603410321-2", R.drawable.fahcricle))


        var listview: ListView = findViewById(R.id.customlistview)

        listview.adapter = StudentAdapter(
            this,
            R.layout.listitem_student, students
        )

        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if (position == 0) {
                var i = Intent(this, Wannaphong::class.java)
                startActivity(i)
            } else if (position == 1) {
                var i = Intent(this, mark::class.java)
                startActivity(i)
            } else if (position == 2) {
                var i = Intent(this, SirinatActivity::class.java)
                startActivity(i)
            } else if (position == 3) {
                var i = Intent(this, PhaiActivity::class.java)
                startActivity(i)
            } else if (position == 4) {
                var i = Intent(this, FahActivity::class.java)
                startActivity(i)
            }
        }
    }
}
