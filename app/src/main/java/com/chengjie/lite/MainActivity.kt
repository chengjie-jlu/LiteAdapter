package com.chengjie.lite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chengjie.recyclerview.ItemData
import com.chengjie.recyclerview.LiteAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
    }

    private fun initData() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LiteAdapter(createData())
    }

    private fun createData(): ArrayList<ItemData> {
        val ret = ArrayList<ItemData>()
        for (i in 0..100) {
            ret.add(TextItemData("This is item $i"))
        }
        return ret
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.aciton_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.second) {
            startActivity(Intent(this, SecondActivity::class.java))
            return true
        }
        return false
    }
}