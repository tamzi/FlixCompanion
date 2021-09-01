package com.tamzi.flixcompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tamzi.flixcompanion.ui.theme.FlixcompanionTheme
import com.tamzi.flixcompanion.ui.theme.gray
import com.tamzi.flixcompanion.ui.theme.white

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlixcompanionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = gray) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FlixcompanionTheme {
        Greeting("Android")
    }
}