package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            val treasureFound = remember { mutableStateOf(0) }
            val direction = remember { mutableStateOf("North") }

            Column {

                Text(text = "Treasures found ${treasureFound.value}")
                Text(text = "Current direction is ${direction.value}")


                Button(onClick = {
                    if (Random.nextBoolean()) {
                        treasureFound.value += 1
                    }
                    direction.value = "West"
                }) {
                    Text(text = "Sail West")
                }
                Button(onClick = {
                    if (Random.nextBoolean()) {
                        treasureFound.value += 1
                    }
                    direction.value = "East"
                }) {
                    Text(text = "Sail East")
                }
                Button(onClick = {
                    if (Random.nextBoolean()) {
                        treasureFound.value += 1
                    }
                    direction.value = "North"

                }) {
                    Text(text = "Sail North")
                }
                Button(onClick = {
                    if (Random.nextBoolean()) {
                        treasureFound.value += 1
                    }
                    direction.value = "South"

                }) {
                    Text(text = "Sail South")
                }

            }


        }
    }
@Preview
@Composable
fun CaptainGamePreview(){

    CaptainGame()
}

}