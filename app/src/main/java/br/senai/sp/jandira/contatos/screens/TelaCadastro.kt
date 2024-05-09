package br.senai.sp.jandira.contatos.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Voltar")
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Novo Contato")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF9C27B0),
                    titleContentColor = Color.White
                )
            )
        },

        content = {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    
                ) {

                    Box(
                        modifier = Modifier.size(
                            width = 150.dp,
                            height = 150.dp
                        ),
                        contentAlignment = Alignment.BottomEnd

                    ) {
                        Card(
                            modifier = Modifier.fillMaxSize(),
                            shape = CircleShape,
                            border = BorderStroke(width = 1.dp, color = Color.DarkGray)
                        ) {
                            Surface(modifier = Modifier.fillMaxSize()) {
                                Icon(
                                    Icons.Default.Person,
                                    contentDescription = "",
                                    tint = Color.DarkGray
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .size(width = 50.dp, height = 50.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF9C27B0))
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.CameraAlt,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                            }
                        }


                    }
                    Spacer(modifier = Modifier.height(22.dp))

                    OutlinedTextField(value = "",git
                        onValueChange = {},
                        label = {
                            Text(text = "Nome do contato")
                        },
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Email do contato")
                        },
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Telefone do contato")
                        },
                        shape = RoundedCornerShape(12.dp)
                    )

                    OutlinedTextField(value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Data de nascimento")
                        },
                        shape = RoundedCornerShape(12.dp)
                    )

                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                    ){
                        Checkbox(checked = false, onCheckedChange = {})
                        Text(text = "Amigo")
                    }

                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Gravar contato")
                    }

                    


                }
            }
        }
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}