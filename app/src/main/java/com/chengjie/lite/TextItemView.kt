package com.chengjie.lite

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.chengjie.recyclerview.ItemData
import com.chengjie.recyclerview.ItemView

/**
 * @author chengjie.jlu@qq.com
 */
class TextItemView(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs),
    ItemView {

    override fun onBindData(data: ItemData, position: Int) {
        text = (data as TextItemData).text
    }
}