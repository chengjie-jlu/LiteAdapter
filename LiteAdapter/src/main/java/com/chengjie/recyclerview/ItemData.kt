package com.chengjie.recyclerview

import androidx.annotation.LayoutRes

/**
 * @author chengjie.jlu@qq.com
 */
interface ItemData {

    @LayoutRes
    fun getLayoutResId(): Int
}
