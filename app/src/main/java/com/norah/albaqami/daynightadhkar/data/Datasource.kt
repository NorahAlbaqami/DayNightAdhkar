package com.norah.albaqami.daynightadhkar.data

import com.norah.albaqami.daynightadhkar.R
import com.norah.albaqami.daynightadhkar.model.EveningAdhkar
import com.norah.albaqami.daynightadhkar.model.MorningAdhkar

class Datasource {
    fun loadMorningAdkar():List<MorningAdhkar>{
        return listOf<MorningAdhkar>(
            MorningAdhkar(R.string.morning1 ,R.string.time1),
            MorningAdhkar(R.string.morning2 ,R.string.time3),
            MorningAdhkar(R.string.morning3 ,R.string.time3),
            MorningAdhkar(R.string.morning4 ,R.string.time3),
            MorningAdhkar(R.string.morning5 ,R.string.time1),
            MorningAdhkar(R.string.morning6 ,R.string.time1),
            MorningAdhkar(R.string.morning7 ,R.string.time3),
            MorningAdhkar(R.string.morning8 ,R.string.time4),
            MorningAdhkar(R.string.morning9 ,R.string.time1),
            MorningAdhkar(R.string.morning10 ,R.string.time7),
            MorningAdhkar(R.string.morning11 ,R.string.time3),
            MorningAdhkar(R.string.morning12 ,R.string.time1),
            MorningAdhkar(R.string.morning13 ,R.string.time1),
            MorningAdhkar(R.string.morning14 ,R.string.time3),
            MorningAdhkar(R.string.morning15 ,R.string.time3),
            MorningAdhkar(R.string.morning16 ,R.string.time3),
            MorningAdhkar(R.string.morning17 ,R.string.time1),
            MorningAdhkar(R.string.morning18 ,R.string.time3),
            MorningAdhkar(R.string.morning19 ,R.string.time1),
            MorningAdhkar(R.string.morning20 ,R.string.time1),
            MorningAdhkar(R.string.morning21 ,R.string.time3),
            MorningAdhkar(R.string.morning22 ,R.string.time10),
            MorningAdhkar(R.string.morning23 ,R.string.time3),
            MorningAdhkar(R.string.morning24 ,R.string.time3),
            MorningAdhkar(R.string.morning25 ,R.string.time3),
            MorningAdhkar(R.string.morning26 ,R.string.time3),
            MorningAdhkar(R.string.morning27 ,R.string.time1),
            MorningAdhkar(R.string.morning29 ,R.string.time100),
            MorningAdhkar(R.string.morning30 ,R.string.time100),
            MorningAdhkar(R.string.morning31 ,R.string.time100),

        )
    }
    fun loadEveningAdkar():List<EveningAdhkar>{
        return listOf<EveningAdhkar>(
            EveningAdhkar(R.string.morning1 ,R.string.time1),
            EveningAdhkar(R.string.morning2 ,R.string.time3),
            EveningAdhkar(R.string.morning3 ,R.string.time3),
            EveningAdhkar(R.string.morning4 ,R.string.time3),
            EveningAdhkar(R.string.evening5,R.string.time1),
            EveningAdhkar(R.string.morning6 ,R.string.time1),
            EveningAdhkar(R.string.evening8 ,R.string.time4),
            EveningAdhkar(R.string.evening9 ,R.string.time1),
            EveningAdhkar(R.string.morning10 ,R.string.time7),
            EveningAdhkar(R.string.morning11 ,R.string.time3),
            EveningAdhkar(R.string.evening12 ,R.string.time1),
            EveningAdhkar(R.string.evening13 ,R.string.time1),
            EveningAdhkar(R.string.morning14 ,R.string.time3),
            EveningAdhkar(R.string.morning15 ,R.string.time3),
            EveningAdhkar(R.string.morning16 ,R.string.time3),
            EveningAdhkar(R.string.morning17 ,R.string.time1),
            EveningAdhkar(R.string.morning18 ,R.string.time3),
            EveningAdhkar(R.string.morning19 ,R.string.time1),
            EveningAdhkar(R.string.morning20 ,R.string.time1),
            EveningAdhkar(R.string.morning21 ,R.string.time3),
            EveningAdhkar(R.string.morning22 ,R.string.time10),
            EveningAdhkar(R.string.morning23 ,R.string.time3),
            EveningAdhkar(R.string.morning24 ,R.string.time3),
            EveningAdhkar(R.string.morning25 ,R.string.time3),
            EveningAdhkar(R.string.morning26 ,R.string.time3),
            EveningAdhkar(R.string.morning27 ,R.string.time1),
            EveningAdhkar(R.string.morning29 ,R.string.time100),
            EveningAdhkar(R.string.morning30 ,R.string.time100),
            EveningAdhkar(R.string.morning31 ,R.string.time100),


            )
    }
}