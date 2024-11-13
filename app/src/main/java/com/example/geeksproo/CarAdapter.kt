package com.example.geeksproo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.geeksproo.databinding.ItemBinding

class CarAdapter(
    private val cars: List<Car>,
    private val onItemClick: (Car) -> Unit
) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = cars[position]
        holder.binding.apply {
            carName.text = car.name
            carYear.text = car.year.toString()

            Glide.with(image.context)
                .load(car.image)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(image)
            root.setOnClickListener{
                onItemClick(car)
            }
        }
    }

    override fun getItemCount(): Int = cars.size
}

