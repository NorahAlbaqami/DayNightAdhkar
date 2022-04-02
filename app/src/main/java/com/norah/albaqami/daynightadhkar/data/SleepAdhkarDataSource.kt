package com.norah.albaqami.daynightadhkar.data

import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.EveningAdhkar

class SleepAdhkarDataSource {
    fun loadSleepAdkar():List<EveningAdhkar> {
        return listOf<EveningAdhkar>(
            EveningAdhkar(R.string.sleep1 , R.string.time3),
            EveningAdhkar(R.string.sleep2 , R.string.time1),
            EveningAdhkar(R.string.sleep3 , R.string.time1),
            EveningAdhkar(R.string.sleep4 , R.string.time3),
            EveningAdhkar(R.string.sleep5 , R.string.time1),
            EveningAdhkar(R.string.sleep6 , R.string.time1),
            EveningAdhkar(R.string.sleep7 , R.string.time1),
            EveningAdhkar(R.string.sleep8 , R.string.time1),
            EveningAdhkar(R.string.sleep9 , R.string.time33),
            EveningAdhkar(R.string.sleep10 , R.string.time33),
            EveningAdhkar(R.string.sleep11 , R.string.time34),
            EveningAdhkar(R.string.sleep12 , R.string.time1),
            EveningAdhkar(R.string.sleep13 , R.string.time1),
            EveningAdhkar(R.string.sleep14 , R.string.time1),
            EveningAdhkar(R.string.sleep15 , R.string.time1),

        )
    }
}