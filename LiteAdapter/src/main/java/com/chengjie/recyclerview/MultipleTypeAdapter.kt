package com.chengjie.recyclerview

import android.view.View
import androidx.annotation.LayoutRes

/**
 * @author chengjie.jlu@qq.com
 */
abstract class MultipleTypeAdapter(val data: ArrayList<*>) : BaseAdapter(data) {

    private val viewTypeMap = mutableMapOf<Class<*>, Int>()

    override fun getItemCount() = data.size

    override fun getLayoutResId(itemData: Any, position: Int): Int {
        val viewType = viewTypeMap[itemData.javaClass]
        return if (viewType == null && itemData is ItemData) {
            itemData.getLayoutResId()
        } else {
            checkNotNull(viewType) {
                "not sure how to inflate view for ${itemData.javaClass.name}, you need call add view type for this type first."
            }
            viewType
        }
    }

    abstract override fun onBindItemView(itemData: Any, view: View, position: Int)

    fun addViewType(clz: Class<*>, @LayoutRes id: Int) {
        viewTypeMap[clz] = id
    }
}