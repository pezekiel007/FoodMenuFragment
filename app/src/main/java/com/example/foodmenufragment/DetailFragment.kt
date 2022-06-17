package com.example.foodmenufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class DetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val foodDetail = view.findViewById<TextView>(R.id.foodDetail)
        val priceDetail = view.findViewById<TextView>(R.id.priceDetail)
        val imageDetail = view.findViewById<ImageView>(R.id.imageDetail)
        val descriptionDetail = view.findViewById<TextView>(R.id.descriptionDetail)

        val name = requireArguments().getInt("food")
        val price = requireArguments().getInt("price")
        val image = requireArguments().getInt("image")
        val details = requireArguments().getInt("details")

        foodDetail.setText(name)
        priceDetail.setText(price)
        imageDetail.setImageResource(image)
        descriptionDetail.setText(details)

    }

}