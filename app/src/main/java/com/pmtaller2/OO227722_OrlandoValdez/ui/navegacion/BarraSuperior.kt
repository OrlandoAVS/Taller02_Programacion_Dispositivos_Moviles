@file:OptIn(ExperimentalMaterial3Api::class)

package com.pmtaller2.OO227722_OrlandoValdez.ui.navegacion

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BarraSuperior(
    titulo: String,
    puedeVolver: Boolean,
    navController: NavController
) {
    CenterAlignedTopAppBar(
        title = { Text(titulo) },
        navigationIcon = {
            if (puedeVolver) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                }
            }
        },
        actions = {}
    )
}

