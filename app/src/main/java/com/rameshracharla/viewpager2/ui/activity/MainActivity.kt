package com.rameshracharla.viewpager2.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.rameshracharla.viewpager2.R
import com.rameshracharla.viewpager2.ui.adapter.MyAdapter
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var myViewPager2: ViewPager2
    lateinit var myAdapter: MyAdapter
    lateinit var text_orientation: TextView
    lateinit var button: Button
    private val arrayList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewPager2 = findViewById(R.id.view_pager)
        button = findViewById(R.id.button)
        text_orientation = findViewById(R.id.text_orientation)

        myAdapter = MyAdapter(this)
        myViewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        text_orientation.text = "Horizontal"
        myViewPager2.adapter = myAdapter

        button.setOnClickListener {
            if (myViewPager2.orientation == ViewPager2.ORIENTATION_HORIZONTAL) {
                text_orientation.text = "Vertical"
                myViewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
            } else {
                text_orientation.text = "Horizontal"
                myViewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            }
        }
    }

}