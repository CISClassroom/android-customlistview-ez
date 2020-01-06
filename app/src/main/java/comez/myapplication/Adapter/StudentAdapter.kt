package comez.myapplication.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import comez.myapplication.Model.Student

public class StudentAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Student>)
    : ArrayAdapter<Student> (mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}

// var -> change value
// val -> final ประกาศแบบไม่เปลี่ยนแปลงค่า