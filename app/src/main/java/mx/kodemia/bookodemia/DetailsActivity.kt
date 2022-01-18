package mx.kodemia.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val button_favorite: ImageButton = findViewById(R.id.imageButton7)
        val button_share: ImageButton = findViewById(R.id.imageButton6)
        button_favorite.setBackgroundResource(0)
        button_share.setBackgroundResource(0)

        text_return.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }

    }
}