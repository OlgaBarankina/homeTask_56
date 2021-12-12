package com.example.hometask_56

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer
import androidx.databinding.DataBindingUtil
import com.example.hometask_56.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binging : ActivityMainBinding // if it is red - press rebuild project
    var mainViewModel = MainViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // need to add into the project code
       // buildFeatures { dataBinding true }
        // + also add spesific code into layout (2 block: layout(1st line) and data)

        binging = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binging.viewModel = mainViewModel
        binging.executePendingBindings()





    }
}