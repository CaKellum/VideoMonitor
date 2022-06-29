package com.example.videomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navHost = NavHostController(context = this)
            NavHost(navController = navHost,
                startDestination = "home") {
                composable("home") { HomeScreen(navController = navHost)}
                composable("go_live") { Settings(navController = navHost)}
                composable("watch_stream") { Settings(navController = navHost) }
                composable("settings") { Settings(navController = navHost) }
            }
        }
    }
}

@Composable
fun Settings(navController: NavController) {}

fun GoLive(navController: NavController) {}

fun WatchStream(navController: NavController) {}

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("go_live") }) {
            Text(text = "Go Live")
        }
        Button(onClick = { navController.navigate("watch_stream")}) {
            Text(text = "Watch Stream")
        }
        Button(onClick = {navController.navigate("settings")}) {
            Text(text = "Settings")
        }
    }
}