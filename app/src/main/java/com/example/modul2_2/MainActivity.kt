package com.example.modul2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var musikList: ArrayList<Musik>
    private lateinit var musikAdapter: MusikAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        musikList = ArrayList()

        musikList.add(Musik(R.drawable.albumtulus,"Lagu 1"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 2"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 3"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 4"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 5"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 6"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 7"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 8"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 9"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 10"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 11"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 12"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 13"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 14"))
        musikList.add(Musik(R.drawable.albumtulus,"Lagu 15"))


        musikAdapter = MusikAdapter(musikList)
        recyclerView.adapter = musikAdapter

    }
}