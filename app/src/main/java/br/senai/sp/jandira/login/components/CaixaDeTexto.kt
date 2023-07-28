package br.senai.sp.jandira.login.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CaixaDeTexto(
    label: String,
    valor: String,
    aoMudar: (String) -> Unit // parametro de retorno que irá voltar para essa função, nesse caso trazendo um valor
) {
    OutlinedTextField(
        value = valor,
        onValueChange = {
            aoMudar(it)
        },
        label = {
            Text(text = label)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview() {
    // CaixaDeTexto(label = "TesteEmail", valor = "TesteValue")
}