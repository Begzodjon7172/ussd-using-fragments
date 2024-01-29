package com.example.ussdfragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussdfragment.databinding.FragmentInfoBinding
import com.example.ussdfragment.models.MyUssd

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentInfoBinding.inflate(layoutInflater)

        binding.apply {

            val myUssd = arguments?.getSerializable("key") as MyUssd
            tvTitle.text = myUssd.title
            tvCode.text = myUssd.code
            tvDesc.text = myUssd.desc


            connectBtn.setOnClickListener {

                val intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:${myUssd.code}"))
                startActivity(intent)
            }

        }

        return binding.root
    }


}