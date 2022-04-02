package com.norah.albaqami.daynightadhkar.data

import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.AdhkarCollection

class AdhkarCollectionData {
    fun loadAdhkarCollection():List<AdhkarCollection>{
        return listOf<AdhkarCollection>(
            AdhkarCollection(R.string.tite1 , R.string.adkar1),
            AdhkarCollection(R.string.tite2 , R.string.adkar2),
            AdhkarCollection(R.string.tite3 , R.string.adkar3),
            AdhkarCollection(R.string.tite4 , R.string.adkar4),
            AdhkarCollection(R.string.titel5 , R.string.adkar5),
            AdhkarCollection(R.string.titel6 , R.string.adkar6),
            AdhkarCollection(R.string.titel7 , R.string.adkar7),
            AdhkarCollection(R.string.titel8 , R.string.adkar8),
            AdhkarCollection(R.string.titel9 , R.string.adkar9),
            AdhkarCollection(R.string.titel10 , R.string.adkar10),
            AdhkarCollection(R.string.titel11 , R.string.adkar11),
            AdhkarCollection(R.string.titel12 , R.string.adkar12),
            AdhkarCollection(R.string.titel3 , R.string.adkar13),
            AdhkarCollection(R.string.titel4 , R.string.adkar14),
        )
    }
}