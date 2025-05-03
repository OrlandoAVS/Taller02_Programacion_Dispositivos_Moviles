package com.pmtaller2.OO227722_OrlandoValdez.modelo

data class Restaurante(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val categoria: String,
    val imagenResId: Int,
    val menu: List<Platillo>
)
