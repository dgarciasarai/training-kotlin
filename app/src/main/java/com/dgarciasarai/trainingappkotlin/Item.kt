package com.dgarciasarai.trainingappkotlin

/**
 * @author Sarai Díaz García
 */
class Item {
    
    var title: String = ""
        get() {
            return "title: $field"
        }
        set(value) {
            field = "title: $value"
        }

    var url: String = ""
}