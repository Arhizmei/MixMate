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
    lateinit var  spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        bind= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)


        spinner =  bind.spinner1
        val spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.cement_grade, android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter
        val selectedItem = spinner.selectedItem.toString()

        }

        fun onClickOk (view: View){
            var cube = 0
            var sand = 0
            var gravel = 0
            var cement = 0

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                    if (position == 0) {

                    bind.tvMessage.visibility = View.VISIBLE
                    bind.tvMessage.text = "Выберите марку цемента!"


                    } else if (position == 1) {
                    var cube1 = bind.edCube.text.toString()
                        cube = cube1.toInt()
                    sand = cube *  870
                        bind.tvSand.text = "$sand"
                    gravel = cube *  1080
                        bind.tvGravel.text = "$gravel"
                    cement = cube * 214
                        bind.tvCement.text = "$cement"

                    }

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    bind.tvMessage.visibility = View.VISIBLE
                    bind.tvMessage.text = "Выберите марку цемента!"
                }
        }
    }




    fun exit_button(view: View){
        finishAffinity()
    }
}