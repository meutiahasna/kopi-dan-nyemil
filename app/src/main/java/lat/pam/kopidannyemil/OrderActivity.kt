package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val namaUser = intent.getStringExtra("EXTRA_NAMA") ?: ""
        val etNama = findViewById<EditText>(R.id.et_order_nama)
        val etAlamat = findViewById<EditText>(R.id.et_order_alamat)
        val etPatokan = findViewById<EditText>(R.id.et_order_patokan)

        etNama.setText(namaUser)

        findViewById<Button>(R.id.btn_order_submit).setOnClickListener {
            val nama = etNama.text.toString().trim()
            val alamat = etAlamat.text.toString().trim()

            if (nama.isNotEmpty() && alamat.isNotEmpty()) {
                val intent = Intent(this, ConfirmationActivity::class.java).apply {
                    putExtra("EXTRA_NAMA", nama)

                    // Supaya tidak bisa BACK ke halaman alamat lagi setelah sukses
                    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                startActivity(intent)
                finish()
            } else if (nama.isEmpty() && alamat.isEmpty()){
                Toast.makeText(this, "Mohon lengkapi alamat pengiriman!", Toast.LENGTH_SHORT).show()
            } else if (nama.isEmpty()) {
                Toast.makeText(this, "Mohon isi nama", Toast.LENGTH_SHORT).show()
            } else if (alamat.isEmpty()) {
                Toast.makeText(this, "Mohon isi alamat", Toast.LENGTH_SHORT).show()
            }
        }
    }
}