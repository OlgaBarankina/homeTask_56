package com.example.hometask_56

import android.os.SystemClock
import android.widget.Chronometer


class ApiManager {

lateinit var tvTimer: Chronometer

     fun getData() {
         var elapsedMillis : Long
         tvTimer.setOnChronometerTickListener {
         elapsedMillis = (SystemClock.elapsedRealtime() - tvTimer.base)

         }

    }



}




