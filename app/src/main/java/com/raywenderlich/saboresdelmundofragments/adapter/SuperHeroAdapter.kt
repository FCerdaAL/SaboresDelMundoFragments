package com.raywenderlich.saboresdelmundofragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.saboresdelmundofragments.R
import com.raywenderlich.saboresdelmundofragments.SuperHero

class SuperHeroAdapter(private val superHeroList:List<SuperHero>, private val onClickListener:(SuperHero) -> Unit) :RecyclerView.Adapter<SuperHeroViewHolder>() {

    //onCreateViewHolder se enargará de pintar los atributos de la lista
    // Se le pasa un layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))

    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {

        val item = superHeroList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int  =  superHeroList.size

}