package com.zmei.mixmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.zmei.mixmate.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bind : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

        val spinner: Spinner = bind.spinner1
        val spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.cement_grade, android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter

        val selectedItem = spinner.selectedItem.toString()

    }




    fun exit_button(view: View){
        finishAffinity()
    }
}