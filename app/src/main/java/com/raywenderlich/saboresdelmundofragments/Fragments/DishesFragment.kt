package com.raywenderlich.saboresdelmundofragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.saboresdelmundofragments.*
import com.raywenderlich.saboresdelmundofragments.adapter.SuperHeroAdapter
import com.raywenderlich.saboresdelmundofragments.databinding.FragmentDishesBinding

class DishesFragment : Fragment() {

    private var _binding : FragmentDishesBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel:SharedViewModel by activityViewModels()

    //var  paisElegido : String = "Chile"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_dishes, container, false)
        /*sharedViewModel.comida.observe(viewLifecycleOwner,{ comida->


        })*/
        _binding = FragmentDishesBinding.inflate(inflater,container,false)
        val view = binding.root


        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*sharedViewModel.pais.observe(viewLifecycleOwner) { pais ->

            //binding.textito.setText(comida)
            paisElegido = pais

        }*/


        initRecyclerView()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)

        val manager = LinearLayoutManager(binding.recyclerSuperHero.context)
        binding.recyclerSuperHero.layoutManager = manager

        //SuperHeroProvider.Companion.getPais(PASAR STRING DEL NOMBRE DEL PAIS)

        /*binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.Companion.getPais("Argentina")) { superhero ->
            onItemSelected(
                superhero
            )*/

        sharedViewModel.pais.observe(viewLifecycleOwner) { pais ->

            binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.Companion.getPais(pais)) { superhero ->
                onItemSelected(
                    superhero
                )

        }

        /*binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.Companion.getPais("Argentina")) { superhero ->
            onItemSelected(
                superhero
            )*/

        }

    }

    private fun onItemSelected(superHero: SuperHero){
        //Toast.makeText(binding.recyclerSuperHero.context,superHero.superhero, Toast.LENGTH_SHORT).show()
        sharedViewModel.saveComida(superHero.superhero.toString())
        findNavController().navigate(R.id.action_dishesFragment_to_descriptionFragment)

    }






}