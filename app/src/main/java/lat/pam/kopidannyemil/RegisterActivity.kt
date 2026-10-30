package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNama = findViewById<EditText>(R.id.et_reg_nama)
        val etUser = findViewById<EditText>(R.id.et_reg_username)
        val etPass = findViewById<EditText>(R.id.et_reg_password)
        val btnReg = findViewById<Button>(R.id.btn_register)

        btnReg.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val user = etUser.text.toString().trim()
            val pass = etPass.text.toString().trim()

            if (nama.isNotEmpty() && user.isNotEmpty() && pass.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java).apply {
                    putExtra("EXTRA_NAMA", nama)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
                startActivity(intent)
                finish()
            } else if (nama.isEmpty() && user.isEmpty() && pass.isEmpty()) {
                Toast.makeText(this, "Mohon lengkapi semua data!", Toast.LENGTH_SHORT).show()
            } else if (nama.isEmpty()) {
                Toast.makeText(this, "Mohon isi nama lengkap", Toast.LENGTH_SHORT).show()
            } else if (user.isEmpty()) {
                Toast.makeText(this, "Mohon isi username", Toast.LENGTH_SHORT).show()
            } else if (pass.isEmpty()) {
                Toast.makeText(this, "Mohon isi password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}