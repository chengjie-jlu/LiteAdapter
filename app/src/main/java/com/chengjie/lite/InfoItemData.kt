package com.chengjie.lite

import com.chengjie.recyclerview.ItemData

/**
 * @author chengjie.jlu@qq.com
 */
data class InfoItemData(val title: String, val content: String) : ItemData {

    override fun getLayoutResId() = R.layout.info_item_view
}
