package com.example.gfxma.recyclerviewapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_row.view.*

class MainAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Récupérer la vue item_row
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row, p0, false))
    }

    // Connaitre le nombre d'items dans la liste
    override fun getItemCount(): Int {
        return items.size
    }

    // Associer chaque item du tableau items à une vue
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.itemsRow.text = items.get(p1)
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Récupérer le textView dans item_row.xml
    val itemsRow = view.item_row
}