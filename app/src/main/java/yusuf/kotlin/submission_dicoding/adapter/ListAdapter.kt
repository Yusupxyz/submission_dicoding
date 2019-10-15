package yusuf.kotlin.submission_dicoding.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import yusuf.kotlin.submission_dicoding.R
import yusuf.kotlin.submission_dicoding.model.Smartphone
import java.util.*

class ListAdapter(private val list: ArrayList<Smartphone>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, harga, photo) = list[position]

        Glide.with(holder.itemView.context)
                .load(photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        var no=position+1;
        holder.tvName.text = no.toString()+". "+name
        holder.tvDetail.text = detail
        holder.tvHarga.text = harga

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_item_harga)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Smartphone)
    }
}