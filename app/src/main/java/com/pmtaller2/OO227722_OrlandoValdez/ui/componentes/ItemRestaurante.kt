package com.pmtaller2.OO227722_OrlandoValdez.ui.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pmtaller2.OO227722_OrlandoValdez.modelo.Restaurante

@Composable
fun ItemRestaurante(restaurante: Restaurante, onClick: () -> Unit = {}) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .padding(end = 8.dp)
            .width(200.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = restaurante.imagenResId),
                contentDescription = restaurante.nombre,
                contentScale = ContentScale.Fit, // Ajuste sin recortar
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp) // o el alto que quieras controlar
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = restaurante.nombre,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
    }
}
