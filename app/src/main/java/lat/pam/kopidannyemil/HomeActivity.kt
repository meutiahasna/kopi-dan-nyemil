package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    private var namaUser: String = "User"
    private lateinit var tvGreeting: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvGreeting = findViewById(R.id.tv_home_greeting)

        // Simpan nama dari Login atau Register pertama kali
        val namaDariIntent = intent.getStringExtra("EXTRA_NAMA")
        if (!namaDariIntent.isNullOrEmpty()) {
            val sharedPref = getSharedPreferences("UserPref", MODE_PRIVATE)
            sharedPref.edit().putString("NAMA_USER", namaDariIntent).apply()
        }

        val rv = findViewById<RecyclerView>(R.id.rv_makanan)
        rv.layoutManager = LinearLayoutManager(this)

        // Menu makanan dan minuman
        val listData = listOf(
            MenuItem("Kopi Susu Gula Aren",
                getString(R.string.desk_kopi_aren), "Rp 22.000", R.drawable.kopi_aren),
            MenuItem("Donat Cokelat",
                getString(R.string.desk_donat), "Rp 12.000", R.drawable.donat_cokelat),
            MenuItem("Sourdough Loaf",
                getString(R.string.desk_sourdough), "Rp 35.000", R.drawable.sourdough),
            MenuItem("Cappuccino",
                getString(R.string.desk_cappuccino), "Rp 25.000", R.drawable.cappuccino),
            MenuItem("Matcha Latte",
                getString(R.string.desk_matcha_latte), "Rp 27.000", R.drawable.matcha_latte)
        )

        rv.adapter = MenuAdapter(listData) { item ->
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_NAMA", namaUser)
            intent.putExtra("EXTRA_MENU", item.nama)
            startActivity(intent)
        }

        findViewById<Button>(R.id.nav_order).setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("EXTRA_NAMA", namaUser)
            startActivity(intent)
        }

        findViewById<Button>(R.id.nav_profile).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }

    // Fungsi onResume dipanggil tiap kali layar muncul lagi
    override fun onResume() {
        super.onResume()
        val sharedPref = getSharedPreferences("UserPref", MODE_PRIVATE)
        namaUser = sharedPref.getString("NAMA_USER", "User") ?: "User"
        tvGreeting.text = "Halo $namaUser,"
    }
}