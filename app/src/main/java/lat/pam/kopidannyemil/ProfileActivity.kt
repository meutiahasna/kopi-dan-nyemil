package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private var namaUser: String = "User"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ambil data tersimpan di SharedPreferences)
        val sharedPref = getSharedPreferences("UserPref", MODE_PRIVATE)

        namaUser = sharedPref.getString("NAMA_USER", null)
            ?: intent.getStringExtra("EXTRA_NAMA")
                    ?: "User"

        val tvGreeting = findViewById<TextView>(R.id.tv_prof_greeting)
        val etNama = findViewById<EditText>(R.id.et_prof_nama)

        tvGreeting.text = "Halo $namaUser,"
        etNama.setText(namaUser)

        findViewById<Button>(R.id.btn_prof_save).setOnClickListener {
            val namaBaru = etNama.text.toString().trim()
            if (namaBaru.isNotEmpty()) {
                namaUser = namaBaru

                // Simpan nama baru ke SharedPreferences
                val editor = sharedPref.edit()
                editor.putString("NAMA_USER", namaBaru)
                editor.apply()

                tvGreeting.text = "Halo $namaUser,"
                Toast.makeText(this, "Profile berhasil diperbarui!", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.nav_prof_home).setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
        }

        findViewById<Button>(R.id.nav_prof_order).setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_NAMA", etNama.text.toString())
            startActivity(intent)
        }
    }
}