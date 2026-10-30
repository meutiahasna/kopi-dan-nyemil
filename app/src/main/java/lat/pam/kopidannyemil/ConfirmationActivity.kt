package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val namaUser = intent.getStringExtra("EXTRA_NAMA") ?: "User"
        findViewById<TextView>(R.id.tv_conf_greeting).text = "Halo $namaUser,"

        findViewById<Button>(R.id.btn_conf_oke).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            intent.putExtra("EXTRA_NAMA", namaUser)
            startActivity(intent)
            finish()
        }
    }
}