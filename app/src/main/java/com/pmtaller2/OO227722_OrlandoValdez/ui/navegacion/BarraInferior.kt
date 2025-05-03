package com.pmtaller2.OO227722_OrlandoValdez.ui.navegacion

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BarraInferior(navController: NavController) {
    val items = listOf(
        NavigationItem("Inicio", "inicio", Icons.Default.Home),
        NavigationItem("Buscar", "busqueda", Icons.Default.Search),
        NavigationItem("Órdenes", "ordenes", Icons.Default.ShoppingCart),
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.ruta,
                onClick = {
                    if (currentRoute != item.ruta) {
                        navController.navigate(item.ruta)
                    }
                },
                icon = { Icon(item.icono, contentDescription = item.titulo) },
                label = { Text(item.titulo) }
            )
        }
    }
}

data class NavigationItem(
    val titulo: String,
    val ruta: String,
    val icono: androidx.compose.ui.graphics.vector.ImageVector
)
