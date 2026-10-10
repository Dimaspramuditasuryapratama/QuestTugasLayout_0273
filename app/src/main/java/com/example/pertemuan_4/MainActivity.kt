package com.example.pertemuan_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.pertemuan_4.ui.theme.Pertemuan_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Pertemuan_4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(R.color.warna_latar)
                ) {
                    ActivitasPertama()
                }
            }
        }
    }
}
