package com.uvg.lab5navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.uvg.lab5navigation.ui.theme.Lab5NavigationTheme

@Composable
fun Greeting(name: String, navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Button(onClick = { navController.navigate("screen2") }) {
            Text(
                text = "Go To Next."
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()

    Lab5NavigationTheme {
        Greeting("Android", navController)
    }
}
