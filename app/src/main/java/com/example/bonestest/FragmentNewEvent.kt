package com.example.bonestest

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context.ALARM_SERVICE
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_newevent.*

val REQUEST_CODE = 0

class FragmentNewEvent : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_newevent, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listenSeekBar(sbMinutes, tvMinutes, "minutes")
        listenSeekBar(sbHours, tvHours, "hours")
        listenSeekBar(sbDays, tvDays, "days")
        createAlarmFunction()
    }

    private fun listenSeekBar(seekBar: SeekBar, textView: TextView, type: String) {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                textView.text =" $progress $type"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }
    private fun createAlarmFunction(){
        btnCreate.setOnClickListener {
            Log.d("___", "start")
            val intent = Intent(activity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
            intent.action = Intent.ACTION_MAIN
            var pendingIntent = PendingIntent.getActivity((activity as MainActivity), REQUEST_CODE, intent, 0)
            val alarmManager = (activity as MainActivity).getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME,SystemClock.elapsedRealtime() + 15000, 60000, pendingIntent)
        }
    }
}