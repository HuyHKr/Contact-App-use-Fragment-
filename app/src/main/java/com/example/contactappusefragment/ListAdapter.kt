package com.example.contactappusefragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(var items:ArrayList<Model>,val fragment:ListFragment):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var tag = view.findViewById<TextView>(R.id.tag)
        var name = view.findViewById<TextView>(R.id.nameOnListView)
        var v = view
    }
    fun adddata(name:String,phoneNumber:String){
        items.add(Model(name,phoneNumber))

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tag.text = items[position].name[0].toString()
        holder.name.text = items[position].name
        holder.v.setOnClickListener{
            fragment.navToDetail(position)
        }
    }
}