package com.example.agungsetiawanrecyclerviewkotlin1.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.agungsetiawanrecyclerviewkotlin1.databinding.ListItemPemainBinding
import com.example.agungsetiawanrecyclerviewkotlin1.model.Pemain

    class AdaptorTeamBola(private val context : Context,
                            private  var data : List<Pemain>?,
                            private val itemclick : OnClickListener)
                     : RecyclerView.Adapter<AdaptorTeamBola.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding =
                ListItemPemainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item: Pemain? = data?.get(position)
            holder.foto.setImageResource(item?.foto ?: 0)
            holder.nama.text = item?.nama

            holder.itemView.setOnClickListener {
                itemclick.detailData(item)
            }
        }

        override fun getItemCount(): Int = data?.size ?: 0

        inner class ViewHolder(val binding: ListItemPemainBinding) :
            RecyclerView.ViewHolder(binding.root) {
            var foto = binding.image
            var nama = binding.txtname

        }

        interface OnClickListener{
            fun detailData(item : Pemain?)
        }


    }