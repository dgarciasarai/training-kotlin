package com.dgarciasarai.trainingappkotlin

/**
 * @author Sarai Díaz García
 */
data class Item(val id: Long, val title: String, val url: String)

fun getItems(): List<Item> {
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/") }
}