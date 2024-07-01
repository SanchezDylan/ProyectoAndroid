package mx.edu.uthermosillo.a21311118.comandas.data.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mx.edu.uthermosillo.a21311118.comandas.data.models.Item
import mx.edu.uthermosillo.a21311118.comandas.databinding.DashboardItemBinding


class DashboardAdapter(private val items: List<Item.DashboardItem>) :
    RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    class ViewHolder(private val binding: DashboardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item.DashboardItem) {
            binding.texto.text = item.texto1
            Glide.with(binding.imagen).load(item.image).into(binding.imagen)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DashboardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}