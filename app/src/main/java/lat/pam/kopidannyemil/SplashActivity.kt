package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnStart = findViewById<Button>(R.id.btn_start)
        btnStart.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}