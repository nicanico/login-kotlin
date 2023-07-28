package br.senai.sp.jandira.login.logincomponent.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.login.R

// funcao de composição de header
// utilize o comp para ser mais rapido

@Composable
fun Header() {
    Row (
        modifier = Modifier.background(Color.Gray)
    ) {
        Column {
            Text(text = "Login" )
            Text(text = "Informe seus dados" )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )
    }
}

// utilize o prev para montar
@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}