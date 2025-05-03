package com.pmtaller2.OO227722_OrlandoValdez.ui.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pmtaller2.OO227722_OrlandoValdez.modelo.Platillo

@Composable
fun ItemPlatillo(platillo: Platillo) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = platillo.imagenResId),
            contentDescription = platillo.nombre,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
        )
        Text(text = platillo.nombre)
        Text(text = platillo.descripcion, maxLines = 2)
    }
}
