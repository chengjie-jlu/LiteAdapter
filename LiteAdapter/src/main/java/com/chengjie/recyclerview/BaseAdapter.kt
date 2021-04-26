package com.chengjie.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

/**
 * @author chengjie.jlu@qq.com
 */
abstract class BaseAdapter(private val data: ArrayList<*>) : RecyclerView.Adapter<ViewHolder>() {

    final override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(viewType, parent, false)
    )

    final override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemData = data[position]
        if (holder.itemView is ItemView) {
            if (itemData is ItemData) {
                holder.itemView.onBindData(itemData, position)
            } else {
                Log.w(
                    "LiteRecyclerView",
                    "${holder.itemView.javaClass.name} already implement com.chengjie.recyclerview.ItemView" +
                            " but the relative data ${itemData.javaClass.name} not implement com.chengjie.recyclerview.ItemData yet."
                )
                onBindItemView(itemData, holder.itemView, position)
            }
        } else {
            onBindItemView(itemData, holder.itemView, position)
        }
    }

    open fun onBindItemView(itemData: Any, view: View, position: Int) {

    }

    override fun getItemCount() = data.size

    final override fun getItemViewType(position: Int) = getLayoutResId(data[position], position)

    @LayoutRes
    abstract fun getLayoutResId(itemData: Any, position: Int): Int
}