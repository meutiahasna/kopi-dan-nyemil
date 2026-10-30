package lat.pam.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    private val listMenu: List<MenuItem>,
    private val onItemClick: (MenuItem) -> Unit
) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMenu: ImageView = itemView.findViewById(R.id.img_menu)
        val tvNama: TextView = itemView.findViewById(R.id.tv_nama_menu)
        val tvDeskripsi: TextView = itemView.findViewById(R.id.tv_deskripsi_menu)
        val tvHarga: TextView = itemView.findViewById(R.id.tv_harga_menu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listMenu[position]
        holder.tvNama.text = item.nama
        holder.tvDeskripsi.text = item.deskripsi
        holder.tvHarga.text = item.harga
        holder.imgMenu.setImageResource(item.gambarResId)

        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount(): Int = listMenu.size
}