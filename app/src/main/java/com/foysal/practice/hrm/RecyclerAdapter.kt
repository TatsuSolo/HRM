package com.foysal.practice.hrm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        

        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return ExceptionDetails.getException().size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var userName : TextView
        var userId: TextView

        init{
            userName = itemView.findViewById(R.id.textView_card_name)
            userId = itemView.findViewById(R.id.textView_card_id)
        }

    }

}