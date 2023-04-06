package com.example.modul2_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusikAdapter(private val musikList:ArrayList<Musik>)
    : RecyclerView.Adapter<MusikAdapter.MusikViewHolder>(){

    var onItemClik : ((Musik) -> Unit)?= null
    class MusikViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        val textView : TextView = itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusikViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item,parent,false ,)
        return MusikViewHolder(view)
    }
    override fun onBindViewHolder(holder: MusikViewHolder, position: Int) {
        val Musik =musikList[position]

        holder.textView.text = Musik.name

        holder.itemView.setOnClickListener{
            onItemClik?.invoke(Musik)
        }
    }

    override fun getItemCount(): Int {
        return musikList.size
    }


}
