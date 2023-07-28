package br.senai.sp.jandira.login.components

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Form() {
    var emailState by remember {
        mutableStateOf("")
    }

    var passwordState by remember {
        mutableStateOf("")
    }

    Card {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            CaixaDeTexto(
                label = "E-mail",
                valor = emailState,
                aoMudar = {
                    emailState = it // a funcao que irá rodar no componente ele irá se lembrar do valor digitado e não esquecer
                }
            )
            CaixaDeTexto(
                label = "Senha",
                valor = passwordState,
                aoMudar = {
                    passwordState = it
//                    var nome = "Pedro"
//                    var idade = 34
//                    Log.i(
//                        "SENAI",
//                        "Form: $nome tem $idade de idade"
//                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}