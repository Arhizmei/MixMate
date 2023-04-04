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

    fun onClickOk(view: View) {
        // Получаем значение, выбранное в Spinner

        val selected = spinner.selectedItemPosition
        val cube1 = bind.edCube.text.toString()
        if (cube1.isNullOrEmpty()) {
            // Если строка пуста, выводим сообщение
            bind.tvMessageCube.visibility = View.VISIBLE
            val eror = "Заполни поле!"
            bind.tvMessageCube.setText(eror)}
        else {
            val cube = cube1.toInt()
        if (selected == 0) {
            // Если ничего не выбрано, выводим сообщение
            bind.tvMessage.visibility = View.VISIBLE
            bind.tvMessage.text = "Выберите марку цемента!"
            bind.tvMessageCube.visibility = View.VISIBLE
            val eror = "Заполни поле!"
            bind.tvMessageCube.setText(eror)
        } else if (selected == 1) {
            // Выполняем вычисления, если выбрана марка цемента
            val cube = cube1.toInt()
            val sand = cube * 870
            bind.tvSand.text = resources.getString(R.string.send) + "  $sand кг"
            val gravel = cube * 1080
            bind.tvGravel.text = resources.getString(R.string.gravel) + "  $gravel кг"
            val cement = cube * 214
            bind.tvCement.text = resources.getString(R.string.cement) + "  $cement кг"
        } else if (selected == 2) {
            // Выполняем вычисления, если выбрана марка цемента

            val cube = cube1.toInt()
            val sand = cube * 855
            bind.tvSand.text = resources.getString(R.string.send) + "  $sand кг"
            val gravel = cube * 1080
            bind.tvGravel.text = resources.getString(R.string.gravel) + "  $gravel кг"
            val cement = cube * 235
            bind.tvCement.text = resources.getString(R.string.cement) + "  $cement кг"
        } else if (selected == 3) {
            // Выполняем вычисления, если выбрана марка цемента

            val cube = cube1.toInt()
            val sand = cube * 795
            bind.tvSand.text = resources.getString(R.string.send) + "  $sand кг"
            val gravel = cube * 1080
            bind.tvGravel.text = resources.getString(R.string.gravel) + "  $gravel кг"
            val cement = cube * 286
            bind.tvCement.text = resources.getString(R.string.cement) + "  $cement кг"
        } else if (selected == 4) {
            // Выполняем вычисления, если выбрана марка цемента

            val cube = cube1.toInt()
            val sand = cube * 750
            bind.tvSand.text = resources.getString(R.string.send) + "  $sand кг"
            val gravel = cube * 1080
            bind.tvGravel.text = resources.getString(R.string.gravel) + "  $gravel кг"
            val cement = cube * 332
            bind.tvCement.text = resources.getString(R.string.cement) + "  $cement кг"
        } else if (selected == 5) {
            // Выполняем вычисления, если выбрана марка цемента

            val cube = cube1.toInt()
            val sand = cube * 705
            bind.tvSand.text = resources.getString(R.string.send) + "  $sand кг"
            val gravel = cube * 1080
            bind.tvGravel.text = resources.getString(R.string.gravel) + "  $gravel кг"
            val cement = cube * 382
            bind.tvCement.text = resources.getString(R.string.cement) + "  $cement кг"
        }}

    }





    fun exit_button(view: View){
        finishAffinity()
    }
}