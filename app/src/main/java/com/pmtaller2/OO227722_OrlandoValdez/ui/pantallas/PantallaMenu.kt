package com.pmtaller2.OO227722_OrlandoValdez.ui.pantallas

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pmtaller2.OO227722_OrlandoValdez.datos.carrito
import com.pmtaller2.OO227722_OrlandoValdez.datos.listaRestaurantes

@Composable
fun PantallaMenu(idRestaurante: Int) {
    val restaurante = listaRestaurantes.find { it.id == idRestaurante } ?: return
    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {
        // Título del restaurante más grande
        Text(
            text = restaurante.nombre,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Text(
            text = restaurante.descripcion,
            style = MaterialTheme.typography.bodySmall,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Lista de platillos
        LazyColumn {
            items(restaurante.menu) { platillo ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    // Imagen más proporcionada
                    Image(
                        painter = painterResource(id = platillo.imagenResId),
                        contentDescription = platillo.nombre,
                        modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = platillo.nombre,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )

                        Text(
                            text = platillo.descripcion,
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Italic,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )

                        Button(
                            onClick = {
                                carrito.add(platillo)
                                Toast.makeText(
                                    context,
                                    "${platillo.nombre} agregado al carrito",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        ) {
                            Text("Agregar al carrito")
                        }
                    }
                }
            }
        }
    }
}
