# รายงานผลการทดลอง

วรรณพงษ์ ภัททิยไพบูลย์ 603410214-3

นายนฤเบศร์ พนะโรจน์ 603410047-6

สิรินาถ จริยพันธ์ 603410221-6

นายปาณัสม์ คำอินทร์ 603410319-9

นางสาวอาทิตยา ฉิมมาแก้ว 603410321-2

## Custom Listview

แสดงคำสั่งสำหรับแสดงข้อมูลชื่อนักศึกษาภายในกลุ่ม กลุ่มละไม่เกิน 4 คน รายละเอียดข้อมูลประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ

เมื่อทำการเลือกรายชื่อนักศึกษาจะทำการเปิดไปยังหน้าที่แสดงข้อมูลนักศึกษาเพิ่มเติม ข้อมูลนักศึกษาประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ
- สาขาวิชา
- อีเมล
- เบอร์โทรศัพท์
- Github

ให้นักศึกษาออกแบบ layout ได้ตามความเหมาสม

## Custom Listview Report

### ข้อมูล Array

```kotlin
var students = mutableListOf<Student>()
students.add(Student("วรรณพงษ์ ภัททิยไพบูลย์", "603410214-3", R.drawable.wannaphong))
students.add(Student("นายนฤเบศร์ พนะโรจน์", "603410047-6", R.drawable.pro))
students.add(Student("สิรินาถ จริยพันธ์", "603410221-6", R.drawable.ff))
students.add(Student("นายปาณัสม์ คำอินทร์", "603410319-9", R.drawable.phai))
students.add(Student("นางสาวอาทิตยา ฉิมมาแก้ว", "603410321-2", R.drawable.fahcricle))
```

### Custom Listview Layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".CustomListActivity">

    <ListView
        android:id="@+id/customlistview"
        android:layout_width="409dp"
        android:layout_height="729dp"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="1dp" />
</LinearLayout>
```

### setOnItemClickListener และการส่งข้อมูลไปอีก Activity

```kotlin
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
```

### การรับข้อมูลจากอีก Activity

```kotlin
public class StudentAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Student>) // รับจากพารามิเตอร์
    : ArrayAdapter<Student> (mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout:LayoutInflater = LayoutInflater.from(mCtx)

        val v:View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView)
        val name : TextView = v.findViewById(R.id.textView)
        val id:TextView = v.findViewById(R.id.textView2)

        val student:Student = items[position]

        name.text = student.name
        id.text = student.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(student.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}
```
