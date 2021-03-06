package com.norah.albaqami.daynightadhkar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
lateinit var binding :FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.morning.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_morningAdhkarFragment)
        }

        binding.evening.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_eveningAdhkarFragment)
        }
        binding.collection.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_adhkarCollectionFragment)

        }
        binding.sleep.setOnClickListener { view :View ->
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_sleepFragment)

        }
    }

}