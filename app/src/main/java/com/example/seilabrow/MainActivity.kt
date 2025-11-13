package com.example.seilabrow

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.seilabrow.ui.theme.SeilaBrowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SeilaBrowTheme {

                }
            }
        }
    }

@Composable
fun GreetingText(modifier: Modifier = Modifier, mensagem: String){
    Text(

        text = mensagem,
            color = Color.Red,
        fontSize = 100.sp,
        lineHeight = 70.sp


    )
}


@Preview(showBackground = true,)
@Composable



fun GreetingPreview() {
    SeilaBrowTheme {
        GreetingText(mensagem = "Feliz Aniversário")
    }
}