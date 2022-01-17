package mx.kodemia.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sigin.*

class SiginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin)

        textReturnFromSigin.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }

        bilSigin.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}