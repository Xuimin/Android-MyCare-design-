package com.example.tracingapp.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tracingapp.R


class HistoryAdapter(val history: Array<History>): RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {
    class HistoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.tv_checkin_location)
        val img_location = itemView.findViewById<ImageView>(R.id.iv_img_location)
        val tv_address = itemView.findViewById<TextView>(R.id.tv_checkin_address)
        val tv_date = itemView.findViewById<TextView>(R.id.tv_checkin_date)
        val tv_time = itemView.findViewById<TextView>(R.id.tv_checkin_time)

        fun bind(history: History) {
            tv_name.text = history.name
            img_location.setImageResource(history.icon)
            tv_address.text = history.location
            tv_date.text = history.date
            tv_time.text = history.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_history, parent, false)

        return HistoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return history.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(history[position])
    }
}