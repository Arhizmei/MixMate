package com.zmei.mixmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.mixmate.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bind : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind= ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
    }
}