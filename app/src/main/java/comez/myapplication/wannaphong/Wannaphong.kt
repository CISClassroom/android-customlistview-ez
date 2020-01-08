package comez.myapplication.wannaphong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import comez.myapplication.R

class Wannaphong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_wannaphong)
    }
}
