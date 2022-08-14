package com.dias.pickerfordate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePicker(view: View) {
        DatePickerFragment().show(supportFragmentManager, getString(R.string.tag_datepicker))
    }

    fun processDatePickerResult(year: Int, month: Int, day: Int) {
        val dateMessage = "${month+1}/$day/$year"
        Toast.makeText(this, "Date: $dateMessage", Toast.LENGTH_SHORT).show()
    }
}