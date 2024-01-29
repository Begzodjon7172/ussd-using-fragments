package com.example.ussdfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussdfragment.databinding.ItemRvBinding
import com.example.ussdfragment.models.MyUssd

class UssdAdapter(private var list: ArrayList<MyUssd>, private var onItemClick: (MyUssd) -> Unit) :
    RecyclerView.Adapter<UssdAdapter.Vh>() {

    inner class Vh(private var itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {
        fun onBind(myUssd: MyUssd) {
            itemRvBinding.apply {

                tvTitle.text = myUssd.title
                tvCode.text = myUssd.code
                tvDesc.text = myUssd.desc

            }

            itemView.setOnClickListener {
                onItemClick.invoke(myUssd)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}