package com.example.lab1

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PracticeScreen (){
    Box(
        modifier = Modifier.fillMaxSize().background(Color.White)
    )
    {
        Row(
            modifier = Modifier.fillMaxWidth() ,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            SquareButton( icon = Icons.AutoMirrored.Filled.ArrowBack)
            SquareButton( icon = Icons.Filled.Edit)
        }
    }
}
@Composable
fun SquareButton(icon : ImageVector){
    OutlinedIconButton(
        onClick = { },
        modifier = Modifier.size(44.dp) ,
        shape = RoundedCornerShape(20.dp) ,
        border = BorderStroke(1.dp , Color.Black)
    ) {
        Icon(
            imageVector = icon ,
            contentDescription = null ,
            modifier = Modifier.size(20.dp)

        )
    }
}
@Preview(showBackground = true )
@Composable
fun PracticeScreenPreview(){
    MaterialTheme {
        PracticeScreen()
    }
}