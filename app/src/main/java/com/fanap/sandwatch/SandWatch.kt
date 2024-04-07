package com.fanap.sandwatch

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SandWatch(
    modifier: Modifier,
    topSand: Int,
    bottomSand: Int,
    sandColor: Color = Color(0xFFFF5722),
    capColor: Color = Color.Blue
){
    Box(modifier = modifier
        .width(200.dp)
        .height(600.dp)){
        
        Canvas(modifier = Modifier.fillMaxSize()) {

            val width = size.width
            val height = size.height

            val watchPath = Path().apply {
                moveTo(
                    x = width * 0.3f, y = height * 0.1f
                )

                lineTo(
                    x = width * 0.3f, y = height * 0.2f
                )

                close()
            }

            clipPath(
                path = watchPath
            ){

            }

        }
    }
}

@Preview
@Composable
fun SandWatchPreview(){

}