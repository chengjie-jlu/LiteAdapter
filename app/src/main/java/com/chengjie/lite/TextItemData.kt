package com.chengjie.lite

import com.chengjie.recyclerview.ItemData

/**
 * @author chengjie.jlu@qq.com
 */
data class TextItemData(val text: String) : ItemData {

    override fun getLayoutResId(): Int {
        return R.layout.simple_text_item_view
    }
}
