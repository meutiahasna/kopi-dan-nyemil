package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.et_login_username)
        val etPassword = findViewById<EditText>(R.id.et_login_password)
        val btnLogin = findViewById<Button>(R.id.btn_login_submit)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java).apply {
                    intent.putExtra("EXTRA_NAMA", username)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
                startActivity(intent)
                finish()
            } else if (username.isEmpty() && password.isEmpty()) {
                Toast.makeText(this, "Mohon isi username dan password", Toast.LENGTH_SHORT).show()
            } else if (username.isEmpty()) {
                Toast.makeText(this, "Mohon isi username", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty()) {
                Toast.makeText(this, "Mohon isi password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}