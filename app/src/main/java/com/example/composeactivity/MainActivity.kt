package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.ui.theme.ComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            welcomScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun welcomScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.image), contentDescription = "man",
            Modifier.size(150.dp), alignment = Alignment.Center,
        )
        Text(
            text = "Hello!",
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            text = "Best place to wirte life stories\n and share your journey experiences",
            color = Color.Gray, textAlign = TextAlign.Center
        )
        var name = mutableStateOf("")

        OutlinedTextField(value = name.value, onValueChange = { name.value = it },
            label = { Text(text = "Name") }, maxLines = 1)

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Button", Modifier.width(100.dp), color = Color.DarkGray)

        }
    }


}