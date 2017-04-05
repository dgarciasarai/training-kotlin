package com.dgarciasarai.trainingappkotlin

import android.content.Context
import android.widget.Toast

/**
 * @author Sarai Díaz García
 */
fun Context.toast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
}