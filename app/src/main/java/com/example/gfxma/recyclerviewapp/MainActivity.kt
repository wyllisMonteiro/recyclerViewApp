package com.example.gfxma.recyclerviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Liste d'items de mon recyclerView
    val items: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addItem()

        recyclerView_main.layoutManager = LinearLayoutManager(this)

        // Charger ma liste d'item dans un adapter qui va se charger de créer la liste
        recyclerView_main.adapter = MainAdapter(items, this)
    }

    // Ajouter des items dans la liste
    fun addItem() {
        items.add("Valentin")
        items.add("Martin")
        items.add("Samy")
        items.add("Wyllis")
    }
}
