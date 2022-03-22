package com.norah.albaqami.daynightadhkar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.EveningAdhkar

class EveningAdapter(
    private val context: Context,
    private val dataSet : List<EveningAdhkar>
): RecyclerView.Adapter<EveningAdapter.ViewHolder>() {

    class ViewHolder (private val view : View): RecyclerView.ViewHolder(view){
        val adhkar : TextView = view.findViewById(R.id.adhkar)
        val  times : TextView =view.findViewById(R.id.times)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return EveningAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adkar_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.adhkar.text = context.resources.getString(item.adhkarResourceId)
        holder.times.text = context.resources.getString(item.times)
    }

    override fun getItemCount(): Int {
        return dataSet.size    }
}