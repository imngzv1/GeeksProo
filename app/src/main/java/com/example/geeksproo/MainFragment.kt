package com.example.geeksproo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.geeksproo.databinding.FragmentMainBinding


class MainFragment : Fragment() {
private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cars = listOf(
            Car("Mercedes", 2023),
            Car( "Toyota Camry", 2020),

            Car( "Toyota Camry", 2020),

            Car( "Toyota Camry", 2020),

            Car( "Toyota Camry", 2020),

            Car( "Toyota Camry", 2020),

            Car( "Toyota Camry", 2020),

        )
        val adapter = CarAdapter(
            cars
        )
        binding.rv.adapter=adapter
            
        
    }


}