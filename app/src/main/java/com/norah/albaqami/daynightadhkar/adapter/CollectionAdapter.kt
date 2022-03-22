package com.norah.albaqami.daynightadhkar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.AdhkarCollection

class CollectionAdapter(
    private val context: Context,
    private val dataSet : List<AdhkarCollection>
): RecyclerView.Adapter<CollectionAdapter.ViewHolder>() {

    class ViewHolder (private val view : View): RecyclerView.ViewHolder(view){
        val title : TextView = view.findViewById(R.id.title)
        val  adhkar : TextView =view.findViewById(R.id.adhkar_coll)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return CollectionAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.collection_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.adhkar.text = context.resources.getString(item.adkar)
        holder.title.text = context.resources.getString(item.title)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}