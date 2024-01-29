package com.example.ussdfragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdfragment.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {

            linear1.setOnClickListener {
                val listFragment = ListFragment()
                val bundle = Bundle()
                bundle.putString("str", "tarif")
                listFragment.arguments = bundle

                parentFragmentManager.beginTransaction()
                    .replace(R.id.my_container, listFragment)
                    .addToBackStack("")
                    .commit()

            }
            linear2.setOnClickListener {
                val listFragment = ListFragment()
                val bundle = Bundle()
                bundle.putString("str", "internet")
                listFragment.arguments = bundle

                parentFragmentManager.beginTransaction()
                    .replace(R.id.my_container, listFragment)
                    .addToBackStack("")
                    .commit()

            }
            linear3.setOnClickListener {
                val listFragment = ListFragment()
                val bundle = Bundle()
                bundle.putString("str", "sms")
                listFragment.arguments = bundle

                parentFragmentManager.beginTransaction()
                    .replace(R.id.my_container, listFragment)
                    .addToBackStack("")
                    .commit()

            }

            linear4.setOnClickListener {
                val listFragment = ListFragment()
                val bundle = Bundle()
                bundle.putString("str", "daqiqa")
                listFragment.arguments = bundle

                parentFragmentManager.beginTransaction()
                    .replace(R.id.my_container, listFragment)
                    .addToBackStack("")
                    .commit()

            }
            linear5.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mobi.uz/uz/services/"))
                startActivity(intent)

            }
            linear6.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mobi.uz/"))
                startActivity(intent)
            }

        }

        return binding.root

    }

}