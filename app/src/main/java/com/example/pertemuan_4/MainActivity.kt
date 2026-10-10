package com.example.pertemuan_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import com.example.pertemuan_4.ui.theme.Pertemuan_4Theme
import com.example.pertemuan_4.ui.theme.Pertemuan_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Pertemuan_4Theme() {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Text(text = "Aplikasi Profil Mahasiswa")
                }
            }
        }
    }
}
