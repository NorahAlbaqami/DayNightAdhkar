package com.norah.albaqami.daynightadhkar.data

import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.AdhkarCollection

class AdhkarCollectionData {
    fun loadAdhkarCollection():List<AdhkarCollection>{
        return listOf<AdhkarCollection>(
            AdhkarCollection(R.string.morning1d , R.string.morning1d)
        )
    }
}