package com.github.yeeun_yun97.toy.tabtabphotocard.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.github.yeeun_yun97.toy.tabtabphotocard.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.yeeun_yun97.toy.tabtabphotocard.ui.ui.theme.TabTabPhotocardTheme

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TabTabPhotocardTheme {
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
//        Greeting(name = "Android")
        image()
    }
}


@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "hello,")
                Text(text = name)
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Show More")
            }
        }
    }
}

@Composable
fun image() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        item {
            val img: Painter = painterResource(id = R.drawable.bg_photos)
            Image(painter = img, contentDescription = "")
        }
        item {
            Surface (){
                val img: Painter = painterResource(id = R.drawable.bg_tape)
                Image(painter = img, contentDescription = "")
                Text(text = "시작하기")
            }
        }

    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun preview() {
    TabTabPhotocardTheme {
        MyApp()
    }
}

@Preview(showBackground = true, name = "default preview")
@Composable
fun DefaultPreview() {
    TabTabPhotocardTheme {
        MyApp()
    }
}