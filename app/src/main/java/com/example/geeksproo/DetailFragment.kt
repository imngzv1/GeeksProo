package com.example.geeksproo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.geeksproo.databinding.FragmentDetailBinding
import com.example.geeksproo.databinding.FragmentMainBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater,  container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments?.getString("name")
        val year = arguments?.getInt("year")
        val image = arguments?.getInt("image")

        binding.detailName.text = name
        binding.detailYear.text = year.toString()

        Glide.with(this)
            .load(image)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.detailImage)
    }
}