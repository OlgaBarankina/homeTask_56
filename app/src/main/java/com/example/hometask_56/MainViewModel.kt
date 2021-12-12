package com.example.hometask_56

import android.os.SystemClock
import android.widget.Chronometer


class MainViewModel  {

    val apiManager = ApiManager()

    lateinit var tvTimer: Chronometer




    fun startChronometer() {

        // connection between UI and ViewModel

        apiManager.getData()
        tvTimer.base = SystemClock.elapsedRealtime()
        tvTimer.start()

    }


    fun stopChronometer() {
        tvTimer.stop()
    }


    fun resetChronometer() {
        tvTimer.base = SystemClock.elapsedRealtime()
    }

}
