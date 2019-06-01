package com.example.myapplication.database

class DBConstants {

    companion object {

        val DBName = "TODO"
        val DBVersion = 1

        //Tabla Listas
        val TABLE_LISTAS = "Listas"
        val ID = "Id"
        val NOMBRE_LISTA = "Nombre"
        val ID_TAREA = "Id_Tarea"

        //Tabla Tareas
        val TABLE_TAREAS = "Tareas"
        ///val ID = "Id"  usamo la de arriba
        val NOMBRE_TAREA = "Nombre_tarea"
        val DESCRIPCION = "Descripcion"
    }

}