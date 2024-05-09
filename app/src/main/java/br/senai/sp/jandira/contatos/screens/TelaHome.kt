package br.senai.sp.jandira.contatos.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.contatos.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome() {
    //opiton comand L

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(text = "Meus contatos")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xfF9F64AF),
                titleContentColor = Color.White
            )
        )
    },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = Color(0xFF9C27B0),
                contentColor = Color.White,
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Botao adicionar"
                )
            }
        },
        content = {
            LazyColumn(modifier = Modifier.padding(it)){
                items(10){
                    Card(modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 6.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 12.dp)

                        ) {
                            Card (modifier = Modifier
                                .height(40.dp)
                                .width(40.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFCEC6CF),
                                ),
                                shape = CircleShape

                            ){
                                Box(modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Text(text = "J",
                                        fontSize = 24.sp,
                                        color = Color.White)

                                }

                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(text = "Julia Paiva",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "Juliapaiva@gmail.com")
                            }
                        }

                    }
                }
            }
        }
    )

}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}