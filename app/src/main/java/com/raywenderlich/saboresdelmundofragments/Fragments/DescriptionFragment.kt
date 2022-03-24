package com.raywenderlich.saboresdelmundofragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.raywenderlich.saboresdelmundofragments.R
import com.raywenderlich.saboresdelmundofragments.SharedViewModel
import com.raywenderlich.saboresdelmundofragments.databinding.FragmentDescriptionBinding
import com.raywenderlich.saboresdelmundofragments.databinding.FragmentDishesBinding
import com.raywenderlich.saboresdelmundofragments.ComidaDescripcionMap
import com.raywenderlich.saboresdelmundofragments.SuperHeroProvider
import com.raywenderlich.saboresdelmundofragments.Fragments.DishesFragment


class DescriptionFragment : Fragment() {

    private var _binding : FragmentDescriptionBinding? = null
    private val binding get() = _binding!!


    // instanciando map

     //var mapaComidas = ComidaDescripcionMap("Chile","Empanada")
    //

    private val sharedViewModel: SharedViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_description, container, false)
        _binding = FragmentDescriptionBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initRecyclerView()

        sharedViewModel.pais.observe(viewLifecycleOwner) { pais ->

            sharedViewModel.comida.observe(viewLifecycleOwner) { comida ->

                //binding.textito.setText(comida)
                binding.textito.setText(ComidaDescripcionMap.Companion.getDescription(pais,comida))

            }

        }

        /*sharedViewModel.comida.observe(viewLifecycleOwner) { comida ->

            //binding.textito.setText(comida)
            binding.textito.setText(ComidaDescripcionMap.Companion.getDescription(sharedViewModel.pais.toString(),comida))

        }*/

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}