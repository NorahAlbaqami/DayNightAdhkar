package com.norah.albaqami.daynightadhkar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.adapter.MorningAdapter
import com.norah.albaqami.daynightadhkar.data.Datasource
import com.norah.albaqami.daynightadhkar.databinding.FragmentMorningAdhkarBinding


class MorningAdhkarFragment : Fragment() {
lateinit var binding :FragmentMorningAdhkarBinding
lateinit var recyclerView: RecyclerView
    val dataSet = Datasource().loadMorningAdkar()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMorningAdhkarBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = binding?.recyclerview!!
        binding.recyclerview.adapter = MorningAdapter(requireContext(), dataSet)
    }

}