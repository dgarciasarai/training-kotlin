package com.dgarciasarai.trainingappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = Item("title", "url")

        var (title, url) = item

        button.setOnClickListener { toast(editText.text) }
    }
}