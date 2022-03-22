package com.norah.albaqami.daynightadhkar.data

import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.EveningAdhkar
import com.norah.albaqami.daynightadhkar.model.MorningAdhkar

class Datasource {
    fun loadMorningAdkar():List<MorningAdhkar>{
        return listOf<MorningAdhkar>(
            MorningAdhkar(R.string.morning1 ,R.string.time1)
        )
    }
    fun loadEveningAdkar():List<EveningAdhkar>{
        return listOf<EveningAdhkar>(
            EveningAdhkar(R.string.morning1 ,R.string.time1)
        )
    }
}