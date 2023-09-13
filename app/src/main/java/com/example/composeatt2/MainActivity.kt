package com.example.composeatt2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeatt2.ui.theme.ComposeAtt2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAtt2Theme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.spfc),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(25.dp),
        )

        Button(
            onClick = { message = "O debug está sendo feito" },
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.run {
                buttonColors(
                        contentColor = Color.White
                    )
            }
        ) {
            Text(text = "Debug")
        }

        Button(
            onClick = { message = "Essas são as informações." },
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.run {
                buttonColors(
                        contentColor = Color.White
                    )
            }
        ) {
            Text(text = "Info")
        }

        Button(
            onClick = { message = "Esse é o aviso" },
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.run {
                buttonColors(
                        contentColor = Color.White
                    )
            }
        ) {
            Text(text = "Warning")
            Surface() {
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = message,
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ComposeAtt2Theme {
        MainScreen()
    }
}