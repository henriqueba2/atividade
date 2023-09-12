package com.example.aplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background)
        var vlrDoTextField by remember {
            mutableStateOf(value:"")
        }
        Log.i(tag: "####", msg: "Rodou aqui fora do column!!!!")
        column(){ this: ColumnScope
            TextField(values = "asdf" , onValueChange = {})
        }
    }
}
