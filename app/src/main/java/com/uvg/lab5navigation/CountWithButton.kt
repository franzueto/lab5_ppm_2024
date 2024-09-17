package com.uvg.lab5navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.lab5navigation.ui.theme.Lab5NavigationTheme

@Composable
fun CountWithButton(modifier: Modifier = Modifier) {
    var amount by rememberSaveable { mutableIntStateOf(0) }

    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Text(text = "Amount:  $amount!")
        Button(onClick = { amount++ }) {
            Text(
                text = "Click To Increase."
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CountWithButtonPreview() {
    Lab5NavigationTheme {
        CountWithButton()
    }
}
