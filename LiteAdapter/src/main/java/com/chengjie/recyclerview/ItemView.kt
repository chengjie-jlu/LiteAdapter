package com.chengjie.recyclerview

/**
 * @author chengjie.jlu@qq.com
 */
interface ItemView {

    fun onBindData(data: ItemData, position: Int)
}