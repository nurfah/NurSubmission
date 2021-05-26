package com.example.nursubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNetworkAdapter(val listNetwork : ArrayList<Alat_jaringan>): RecyclerView.Adapter<ListNetworkAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_network, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val alatJaringan = listNetwork[position]
        Glide.with(holder.itemView.context)
            .load(alatJaringan.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = alatJaringan.name
        holder.tvDetail.text = alatJaringan.detail
        holder.itemView.setOnClickListener {
            val context= holder.itemView.context
            val detailActivity = Intent(context, DetailActivity::class.java)
            detailActivity.putExtra(DetailActivity.DATA_NAMA, alatJaringan.name)
            detailActivity.putExtra(DetailActivity.DATA_DETAIL, alatJaringan.detail)
            detailActivity.putExtra(DetailActivity.DATA_GAMBAR, alatJaringan.photo)
            context.startActivity(detailActivity)
        }
    }

    override fun getItemCount(): Int {
        return listNetwork.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Alat_jaringan)
    }
}


