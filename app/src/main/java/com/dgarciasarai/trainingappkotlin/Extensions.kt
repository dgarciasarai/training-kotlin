package com.dgarciasarai.trainingappkotlin

import android.content.Context
import android.widget.Toast

/**
 * @author Sarai Díaz García
 */
fun Context.toast(text: CharSequence, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, length).show();
}