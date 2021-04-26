package com.chengjie.lite

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import android.widget.TextView
import com.chengjie.recyclerview.ItemData
import com.chengjie.recyclerview.ItemView

/**
 * @author chengjie.jlu@qq.com
 */
class InfoItemView(context: Context?, attrs: AttributeSet?) :
    RelativeLayout(context, attrs), ItemView {

    private lateinit var titleTv: TextView
    private lateinit var contentTv: TextView

    override fun onFinishInflate() {
        super.onFinishInflate()
        titleTv = findViewById(R.id.title)
        contentTv = findViewById(R.id.content)
    }

    override fun onBindData(data: ItemData, position: Int) {
        data as InfoItemData
        titleTv.text = data.title
        contentTv.text = data.content
    }
}