package com.dgarciasarai.trainingappkotlin

/**
 * @author Sarai Díaz García
 */
class Item {
    
    var title: String = ""
        get() {
            return "title: $field"
        }
    
    var url: String = ""
}