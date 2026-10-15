package com.example.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember {mutableSetOf(value="")}
    var  textAlamat by remember {mutableSetOf(value="")}
    var textJK by remember {mutableSetOf(value="")}
    var gender: List<String> = ListOf("Laki-laki", "Perempuan")
}

@Composable
fun ListOf(x0: String, x1: String) {
    TODO("Not yet implemented")
}