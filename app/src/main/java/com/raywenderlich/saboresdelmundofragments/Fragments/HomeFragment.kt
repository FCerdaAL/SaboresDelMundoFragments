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
import com.raywenderlich.saboresdelmundofragments.adapterPaises.PaisesAdapter
import com.raywenderlich.saboresdelmundofragments.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val sharedViewModel:SharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_home, container, false)
        //val button = view.findViewById<Button>(R.id.button_navigation)


       /* button.setOnClickListener{
            view.findNavController().navigate(R.id.action_homeFragment_to_dishesFragment)
        }*/

        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
        //return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)

        val manager = LinearLayoutManager(binding.recyclerPaises.context)
        binding.recyclerPaises.layoutManager = manager
        //SuperHeroProvider.Companion.getPais(PASAR STRING DEL NOMBRE DEL PAIS)
        binding.recyclerPaises.adapter = PaisesAdapter(PaisesProvider.Companion.superHeroList) { superhero ->
            onItemSelected(
                superhero
            )
        }

    }

    private fun onItemSelected(superHero: Paises){
        //Toast.makeText(binding.recyclerPaises.context,superHero.superhero, Toast.LENGTH_SHORT).show()
        sharedViewModel.savePais(superHero.superhero.toString())
        findNavController().navigate(R.id.action_homeFragment_to_dishesFragment)

    }






}