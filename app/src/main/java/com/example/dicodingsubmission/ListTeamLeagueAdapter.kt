package com.example.dicodingsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ListTeamLeagueAdapter(private val dataSet: ArrayList<TeamLeagueModel>) :
    RecyclerView.Adapter<ListTeamLeagueAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemImage: ImageView
        val itemName: TextView
        val itemDesc: TextView
        init {
            itemImage = view.findViewById(R.id.imageView)
            itemName = view.findViewById(R.id.tv_item_name)
            itemDesc = view.findViewById(R.id.tv_item_desc)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_team_league, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Picasso.get().load(dataSet[position].badgeImageURL).into(viewHolder.itemImage);
        viewHolder.itemName.text = dataSet[position].teamName
        viewHolder.itemDesc.text = "Terbentuk pada tahun: " + dataSet[position].formYear

        viewHolder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(dataSet[viewHolder.adapterPosition])}
    }

    override fun getItemCount() = dataSet.size

    interface OnItemClickCallback {
        fun onItemClicked(data:TeamLeagueModel)
    }
}
