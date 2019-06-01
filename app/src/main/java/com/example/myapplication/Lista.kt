package com.example.myapplication

import java.io.Serializable

class Lista (var id: Int, var nombre: String, var tareas: List<Tareas>) : Serializable {
}