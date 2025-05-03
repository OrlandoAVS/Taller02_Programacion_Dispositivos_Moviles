package com.pmtaller2.OO227722_OrlandoValdez.datos

import com.pmtaller2.OO227722_OrlandoValdez.R
import com.pmtaller2.OO227722_OrlandoValdez.modelo.Restaurante
import com.pmtaller2.OO227722_OrlandoValdez.modelo.Platillo

val listaRestaurantes = listOf(
    Restaurante(
        id = 1,
        nombre = "Little-Caesars",
        descripcion = "pizzas de alta calidad a precios asequibles",
        categoria = "Pizza",
        imagenResId = R.drawable.little_logo,
        menu = listOf(
            Platillo(
                nombre = "Pizza de Peperoni",
                descripcion = "Deliciosa pizza de peperoni",
                imagenResId = R.drawable.little_pizza_peperoni
            ),
            Platillo(
                nombre = "Pizza de Jamón",
                descripcion = "Deliciosa pizza de jamón",
                imagenResId = R.drawable.little_pizza_jamon
            ),
            Platillo(
                nombre = "Pizza Suprema",
                descripcion = "Deliciosa pizza suprema con muchos vegetales",
                imagenResId = R.drawable.little_pizza_suprema
            ),
            Platillo(
                nombre = "Pizza de Queso",
                descripcion = "Deliciosa pizza de queso",
                imagenResId = R.drawable.little_pizza_queso
            ),
            Platillo(
                nombre = "Combo",
                descripcion = "Delicioso combo de pizza con palitroques y una soda",
                imagenResId = R.drawable.little_combo
            ),
        )
    ),
    Restaurante(
        id = 2,
        nombre = "Domino´s Pizza",
        descripcion = "especializada en la elaboración de pizzas, así como en la venta de otros productos alimenticios como alitas de pollo, pan, pastas, sándwiches y postres. ",
        categoria = "Pizza",
        imagenResId = R.drawable.dominos_logo,
        menu = listOf(
            Platillo(
                nombre = "Pizza de Peperoni",
                descripcion = "Deliciosa pizza de peperoni",
                imagenResId = R.drawable.dominos_peperoni
            ),
            Platillo(
                nombre = "Pizza de 4 Quesos",
                descripcion = "Deliciosa pizza de 4 quesos",
                imagenResId = R.drawable.dominos_4_quesos
            ),
            Platillo(
                nombre = "Pizza Hawaiana",
                descripcion = "Deliciosa pizza hawaiana",
                imagenResId = R.drawable.dominos_hawaiana
            ),
            Platillo(
                nombre = "Trio de Pizzas Personales",
                descripcion = "Deliciosas pizzas persolanes a elegir",
                imagenResId = R.drawable.dominos_trio_de_personales
            )
        )
    ),
    Restaurante(
        id = 3,
        nombre = "Papa Johns",
        descripcion = "cadena de pizzerías estadounidense, la cuarta más grande en Estados Unidos, con presencia a nivel mundia",
        categoria = "Pizza",
        imagenResId = R.drawable.papa_logo,
        menu = listOf(
            Platillo(
                nombre = "Combo 1",
                descripcion = "Deliciosa pizza de peperoni, con soda y palitroques",
                imagenResId = R.drawable.papa_combo
            ),
            Platillo(
                nombre = "Pizza de Verano",
                descripcion = "Deliciosa pizza de muchos ingredientes de verano",
                imagenResId = R.drawable.papa_verano
            ),
            Platillo(
                nombre = "Alitas de Pollo",
                descripcion = "Deliciosa Alitas de pollo bañadas de la salsa de su elección",
                imagenResId = R.drawable.papa_alitas
            )
        )
    ),
    Restaurante(
        id = 4,
        nombre = "Pollo Campero",
        descripcion = "cadena de restaurantes de comida rápida especializada en pollo frito de origen guatemalteco.",
        categoria = "Pollo",
        imagenResId = R.drawable.campero_logo,
        menu = listOf(
            Platillo(
                nombre = "Combo de 6 Piezas de Pollo",
                descripcion = "Deliciosa pollo de tu elección",
                imagenResId = R.drawable.campero_6p
            ),
            Platillo(
                nombre = "Como de 8 Piezas de Pollo",
                descripcion = "Deliciosa pollo de tu elección",
                imagenResId = R.drawable.campero_8p
            ),
            Platillo(
                nombre = "Banquete de Pollo",
                descripcion = "Deliciosas piezas de pollo acompañado de la salsa de su elección",
                imagenResId = R.drawable.campero_banquete
            )
        )
    ),
    Restaurante(
        id = 5,
        nombre = "Roy Lee",
        descripcion = "Es un restaurante de comida china en San Salvador que ofrece una variedad de platos",
        categoria = "Comida China",
        imagenResId = R.drawable.roy_logo,
        menu = listOf(
            Platillo(
                nombre = "Arroz Cantones",
                descripcion = "Delicioso arroz con vegetales",
                imagenResId = R.drawable.roy_arroz
            ),
            Platillo(
                nombre = "Lomito de Res von Vegetales",
                descripcion = "Delicioso lomito de carne con vegetales",
                imagenResId = R.drawable.roy_lomito_verduras
            ),
            Platillo(
                nombre = "Lomito de Cerdo con Vegetales",
                descripcion = "Delicioso lomito de cerdo con vegetales",
                imagenResId = R.drawable.roy_lomito_cerdo
            ),
            Platillo(
                nombre = "Pollo Agridulce",
                descripcion = "Delicioso pollo agridulce",
                imagenResId = R.drawable.roy_pollo_agridulce
            )
        )
    ),
    Restaurante(
        id = 6,
        nombre = "Wendy´s",
        descripcion = "Su menú está compuesto por hamburguesas, sándwiches y batidos.",
        categoria = "Hamburguesa",
        imagenResId = R.drawable.wendys_logo,
        menu = listOf(
            Platillo(
                nombre = "Hamburguesa Doble",
                descripcion = "Deliciosa hamburguesa con doble carne",
                imagenResId = R.drawable.wendys_doble
            ),
            Platillo(
                nombre = "Hamburguesa Triple",
                descripcion = "Deliciosa hamburguesa con triple carne",
                imagenResId = R.drawable.wendys_triple
            ),
            Platillo(
                nombre = "Hamburguesa Melt",
                descripcion = "Deliciosa hamburguesa con carne y mucho queso",
                imagenResId = R.drawable.wendys_melt
            ),
            Platillo(
                nombre = "Nuggets de Pollo",
                descripcion = "Deliciosa nuggets de pollo con salsa",
                imagenResId = R.drawable.wendys_nuggets
            ),
            Platillo(
                nombre = "Papas con Helado de Vainilla",
                descripcion = "Deliciosa convinación de papas con helado de vainilla",
                imagenResId = R.drawable.wendys_papas
            )

        )
    ),
    Restaurante(
        id = 7,
        nombre = "KFC",
        descripcion = "Su menú está compuesto por pollo frito empanado con unas especies secretas",
        categoria = "Pollo",
        imagenResId = R.drawable.kfc_logo,
        menu = listOf(
            Platillo(
                nombre = "Banquete de Pollo",
                descripcion = "Deliciosas piezas de pollo con sus acompañamientos",
                imagenResId = R.drawable.kfc_banquete
            ),
            Platillo(
                nombre = "Combo 1",
                descripcion = "Delicioso pollo con hamburguesa con acompañamientos",
                imagenResId = R.drawable.kfc_combo
            ),
            Platillo(
                nombre = "Big XL",
                descripcion = "Delicioso pollo con hamburguesa con acompañamientos a lo XL",
                imagenResId = R.drawable.kfc_xl
            )
        )
    )
)
