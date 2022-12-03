package com.tanvi.snaphelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
class MainActivity : AppCompatActivity() {
    lateinit var snapHelper: SnapHelper
    lateinit var recyclerView: RecyclerView
    var listData1 = mutableListOf<ItemData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        formRecyclerView()
        setRecyclerView()
        snapHelper=LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }
    private fun formRecyclerView(){
      recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val adapter =AdapterClass(listData1)
      recyclerView.adapter=adapter
    }
    private fun setRecyclerView(){
        val data1 =ItemData(R.drawable.ib6)
        val data2 =ItemData(R.drawable.ib7)
        val data3 =ItemData(R.drawable.ib9)
        val data4 =ItemData(R.drawable.ib8)
        listData1.add(data1)
        listData1.add(data2)
        listData1.add(data3)
        listData1.add(data4)

    }
}