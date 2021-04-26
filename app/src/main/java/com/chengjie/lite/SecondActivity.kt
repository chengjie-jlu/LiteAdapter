package com.chengjie.lite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initData()
    }

    private fun initData() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val myAdapter = MyAdapter(createData())
        recyclerView.adapter = myAdapter
        myAdapter.addViewType(String::class.java, R.layout.simple_text_item_view)
    }

    private fun createData(): ArrayList<*> {
        val ret = ArrayList<Any>()
        for (i in 0..50) {
            ret.add(InfoItemData("this is info element $i", "this is content"))
            ret.add("This is text element $i")
        }
        return ret
    }
}