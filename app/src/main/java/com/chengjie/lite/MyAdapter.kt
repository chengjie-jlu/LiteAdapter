package com.chengjie.lite

import  android.view.View
import android.widget.TextView
import com.chengjie.recyclerview.MultipleTypeAdapter

/**
 * @author chengjie.jlu@tencent.com
 */
class MyAdapter(data: ArrayList<*>) : MultipleTypeAdapter(data) {

    override fun onBindItemView(itemData: Any, view: View, position: Int) {
        if (itemData is String) {
            (view as TextView).text = itemData
        }
    }
}