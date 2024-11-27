package com.example.ucppam1
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun LatihanInput(modifier: Modifier = Modifier) {


    var email by remember { mutableStateOf("") }
    var notelepon by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }


    var tahunmsk = listOf("2020","2021", "2022")

    var confemail by remember { mutableStateOf("") }
    var confnotelepon by remember { mutableStateOf("") }
    var confalamat by remember { mutableStateOf("") }



    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(text = "email")
            },
            placeholder = {
                Text(text = "Isi email anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        TextField(
            value = notelepon,
            onValueChange = { notelepon= it },
            label = {
                Text(text = "notelepon")
            },
            placeholder = {
                Text(text = "Isi notelepon anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        TextField(
            value = alamat,
            onValueChange = { alamat= it },
            label = {
                Text(text = "alamat")
            },
            placeholder = {
                Text(text = "Isi alamat anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )


        Button(onClick = {
            confemail = email
            confalamat = alamat
            confnotelepon = notelepon
        }) {
            Text(text = "Submit")
        }
        Column(
            modifier =  Modifier.fillMaxSize()
        ){

        }
    }
}
