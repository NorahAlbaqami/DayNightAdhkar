package com.norah.albaqami.daynightadhkar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.norah.albaqami.daynightadhkar.adapter.EveningAdapter
import com.norah.albaqami.daynightadhkar.data.SleepAdhkarDataSource
import com.norah.albaqami.daynightadhkar.databinding.FragmentSleepBinding


class SleepFragment : Fragment() {
lateinit var binding : FragmentSleepBinding
    lateinit var recyclerview : RecyclerView
    val dataSet = SleepAdhkarDataSource().loadSleepAdkar()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSleepBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerview = binding?.recyclerview!!
        binding.recyclerview.adapter = EveningAdapter(requireContext(), dataSet)
    }

}