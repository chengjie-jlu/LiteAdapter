package com.chengjie.recyclerview

import android.view.View
import java.lang.IllegalStateException

/**
 * @author chengjie.jlu@qq.com
 */
class LiteAdapter(val data: ArrayList<ItemData>) : BaseAdapter(data) {

    override fun onBindItemView(itemData: Any, view: View, position: Int) {
        throw IllegalStateException("${view.javaClass.name} must implement com.chengjie.recyclerview.ItemView when using LiteAdapter")
    }

    override fun getLayoutResId(itemData: Any, position: Int) = data[position].getLayoutResId()
}