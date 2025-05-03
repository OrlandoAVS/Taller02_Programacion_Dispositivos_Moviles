package com.pmtaller2.OO227722_OrlandoValdez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.pmtaller2.OO227722_OrlandoValdez.ui.navegacion.BarraInferior
import com.pmtaller2.OO227722_OrlandoValdez.ui.navegacion.BarraSuperior
import com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas.*
import com.pmtaller2.OO227722_OrlandoValdez.ui.theme.FoodSpotByAgarciaTheme
import com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas.PantallaBusqueda
import com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas.PantallaOrdenes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotByAgarciaTheme {
                AppConNavegacion()
            }
        }
    }
}

@Composable
fun AppConNavegacion() {
    val navController = rememberNavController()

    val currentRoute by navController.currentBackStackEntryAsState()
    val rutaActual = currentRoute?.destination?.route

    val mostrarBarraInferior = rutaActual in listOf("inicio", "busqueda", "ordenes")
    val puedeVolver = rutaActual?.startsWith("menu/") == true

    Scaffold(
        topBar = {
            when (rutaActual) {
                "busqueda" -> BarraSuperior("Buscar", false, navController)
                "ordenes" -> BarraSuperior("Mis Órdenes", false, navController)
                "inicio" -> BarraSuperior("Restaurantes", false, navController)
                else -> BarraSuperior("Detalles", true, navController)
            }
        },
        bottomBar = {
            if (mostrarBarraInferior) {
                BarraInferior(navController)
            }
        }
    ) { padding ->
        NavegacionApp(navController, Modifier.padding(padding))
    }
}


@Composable
fun NavegacionApp(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = "inicio", modifier = modifier) {
        composable("inicio") { PantallaInicio(navController) }
        composable("busqueda") { PantallaBusqueda(navController) }
        composable("ordenes") { PantallaOrdenes() }
        composable("menu/{idRestaurante}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("idRestaurante")?.toIntOrNull() ?: return@composable
            PantallaMenu(id)
        }
    }
}


