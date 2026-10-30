package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        findViewById<Button>(R.id.btn_to_register).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        findViewById<Button>(R.id.btn_to_login).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}