package com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.pmtaller2.OO227722_OrlandoValdez.datos.listaRestaurantes
import com.pmtaller2.OO227722_OrlandoValdez.ui.componentes.ItemRestaurante

@Composable
fun PantallaInicio(navController: NavController) {
    val restaurantesPorCategoria = listaRestaurantes.groupBy { it.categoria }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        restaurantesPorCategoria.forEach { (categoria, restaurantes) ->
            item {
                Text(
                    text = categoria,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                LazyRow {
                    items(restaurantes.size) { index ->
                        val restaurante = restaurantes[index]
                        ItemRestaurante(restaurante = restaurante) {
                            navController.navigate("menu/${restaurante.id}")
                        }
                    }
                }
            }
        }
    }
}
