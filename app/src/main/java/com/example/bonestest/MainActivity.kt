package com.example.bonestest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) supportFragmentManager.beginTransaction().replace(R.id.flMainContainer, FragmentNewEvent()).commit()
        listenSwitcher()
        Log.d("__", "fsfasfd")
    }


    private fun listenSwitcher() {
        tvNewEvent.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flMainContainer, FragmentNewEvent()).commit()
        }
        tvSchedules.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flMainContainer, FragmentSchedule()).commit()
        }
    }

}
