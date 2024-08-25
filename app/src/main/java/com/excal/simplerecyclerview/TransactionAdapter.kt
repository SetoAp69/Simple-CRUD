package com.excal.simplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter(private val listTransaction:ArrayList<Transaction>): RecyclerView.Adapter<TransactionAdapter.ListViewHolder>() {

    class ListViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val logo: ImageView =view.findViewById(R.id.iv_logo)
        val target:TextView=view.findViewById(R.id.tv_target_transaction)
        val date:TextView=view.findViewById(R.id.tv_date)
        val amount:TextView=view.findViewById(R.id.tv_amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_transaction_row,parent,false)
        return ListViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listTransaction.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val(targetName,amount,date,idGambar)=listTransaction[position]
        holder.target.text=targetName
        holder.amount.text="$${amount}"
        holder.date.text=date

        //path dari gambar yang mau ditampilkan
        holder.logo.setImageResource(idGambar)
    }
}