package com.raywenderlich.saboresdelmundofragments.adapterPaises

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.saboresdelmundofragments.Paises
import com.raywenderlich.saboresdelmundofragments.R
import com.raywenderlich.saboresdelmundofragments.SuperHero

class PaisesAdapter(private val superHeroList:List<Paises>, private val onClickListener:(Paises) -> Unit) :RecyclerView.Adapter<PaisesViewHolder>() {

    //onCreateViewHolder se enargará de pintar los atributos de la lista
    // Se le pasa un layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaisesViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return PaisesViewHolder(layoutInflater.inflate(R.layout.item_pais,parent,false))

    }

    override fun onBindViewHolder(holder: PaisesViewHolder, position: Int) {

        val item = superHeroList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int  =  superHeroList.size

}