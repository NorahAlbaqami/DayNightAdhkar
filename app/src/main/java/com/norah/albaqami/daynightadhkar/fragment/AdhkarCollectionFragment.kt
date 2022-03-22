package com.norah.albaqami.daynightadhkar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.adapter.CollectionAdapter
import com.norah.albaqami.daynightadhkar.data.AdhkarCollectionData
import com.norah.albaqami.daynightadhkar.databinding.FragmentAdhkarCollectionBinding

class AdhkarCollectionFragment : Fragment() {
lateinit var binding: FragmentAdhkarCollectionBinding
    lateinit var recyclerview : RecyclerView
    val dataSet = AdhkarCollectionData().loadAdhkarCollection()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAdhkarCollectionBinding.inflate(inflater , container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerview =binding.recyclerview
        binding.recyclerview.adapter = CollectionAdapter(requireContext() ,dataSet)
    }
}