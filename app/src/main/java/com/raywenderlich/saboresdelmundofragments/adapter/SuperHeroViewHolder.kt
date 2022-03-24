package com.raywenderlich.saboresdelmundofragments.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.saboresdelmundofragments.R
import com.raywenderlich.saboresdelmundofragments.SuperHero
import com.raywenderlich.saboresdelmundofragments.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    //val superHero = view.findViewById<TextView>(R.id.tvComida)

    // Ojo con el tipo de View!!!!
    //val photo = view.findViewById<ImageView>(R.id.ivComida)

    fun render(superHeroModel : SuperHero, onClickListener:(SuperHero) -> Unit){
        binding.tvComida.text = superHeroModel.superhero
        Glide.with(binding.ivComida.context).load(superHeroModel.photo).into(binding.ivComida)


        itemView.setOnClickListener {
            onClickListener(superHeroModel)
        }

    }

}