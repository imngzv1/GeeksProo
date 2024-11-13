package com.example.geeksproo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geeksproo.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cars = listOf(
            Car(R.drawable.img_1,"Mercedes", 2023),
            Car(R.drawable.img,"Kia", 2023),
            Car(R.drawable.img_2,"BMW", 2023),
            Car(R.drawable.img_1,"Mercedes", 2023),
            Car(R.drawable.img,"Kia", 2023),
            Car(R.drawable.img_2,"BMW", 2023),
            Car(R.drawable.img_1,"Mercedes", 2023),
            Car(R.drawable.img,"Kia", 2023),
            Car(R.drawable.img_2,"BMW", 2023),
            Car(R.drawable.img_1,"Mercedes", 2023),
            Car(R.drawable.img,"Kia", 2023),
            Car(R.drawable.img_2,"BMW", 2023),
            Car(R.drawable.img_1,"Mercedes", 2023),
            Car(R.drawable.img,"Kia", 2023),
            Car(R.drawable.img_2,"BMW", 2023),
        )
        val adapter = CarAdapter(cars) { car ->
            val bundle= Bundle().apply {
                putString("name", car.name)
                putInt("year", car.year)
                putInt("image", car.image)
            }
            findNavController().navigate(R.id.action_mainFragment_to_detailFragment,bundle)
        }
        binding.rv.layoutManager = LinearLayoutManager(context)
        binding.rv.adapter = adapter
    }
}