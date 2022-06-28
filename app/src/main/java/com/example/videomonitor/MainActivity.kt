package com.example.videomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.videomonitor.ui.theme.VideoMonitorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoMonitorTheme {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Start Stream")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Watch Stream")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Settings")
                    }
                }
            }
        }
    }
}