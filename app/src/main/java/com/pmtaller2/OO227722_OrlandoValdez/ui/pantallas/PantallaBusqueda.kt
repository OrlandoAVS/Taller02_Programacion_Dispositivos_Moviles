package com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pmtaller2.OO227722_OrlandoValdez.datos.listaRestaurantes
import com.pmtaller2.OO227722_OrlandoValdez.modelo.Restaurante

@Composable
fun PantallaBusqueda(navController: NavController) {
    var textoBusqueda by remember { mutableStateOf("") }

    val resultados: List<Restaurante> = remember(textoBusqueda) {
        if (textoBusqueda.isBlank()) {
            emptyList()
        } else {
            val texto = textoBusqueda.lowercase()
            listaRestaurantes.filter { restaurante ->
                val matchNombre = restaurante.nombre.lowercase().contains(texto)
                val matchCategoria = restaurante.categoria.lowercase().contains(texto)
                val matchPlatillos = restaurante.menu.any {
                    it.nombre.lowercase().contains(texto)

                }
                matchNombre || matchCategoria || matchPlatillos
            }
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        OutlinedTextField(
            value = textoBusqueda,
            onValueChange = { textoBusqueda = it },
            label = { Text("Buscar por restaurante, platillo o categoría") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        if (resultados.isEmpty() && textoBusqueda.isNotBlank()) {
            Text("No se encontraron resultados", style = MaterialTheme.typography.bodyMedium)
        }

        LazyColumn {
            items(resultados) { restaurante ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable {
                            navController.navigate("menu/${restaurante.id}")
                        }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = restaurante.nombre, style = MaterialTheme.typography.titleMedium)
                        Text(text = "Categoría: ${restaurante.categoria}", style = MaterialTheme.typography.bodyMedium)
                        Text(
                            text = "Platillos: " + restaurante.menu.joinToString { it.nombre },
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}
