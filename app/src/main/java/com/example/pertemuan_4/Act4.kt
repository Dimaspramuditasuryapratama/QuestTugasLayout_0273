package com.example.pertemuan_4

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ActivitasPertama() {
    Text(text = "Halaman Profil Mahasiswa")
}


@Composable
fun CardProfil(
    @StringRes nama: Int,
    @StringRes telepon: Int,
    @StringRes alamat: Int,
    @ColorRes warna: Int,
    modifier: Modifier = Modifier,
    namaMiring: Boolean = false
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(warna)
        )
    ) {
        Column(
            modifier = Modifier.padding(
                dimensionResource(R.dimen.padding_kartu)
            )
        ) {
            Text(
                text = stringResource(nama),
                color = colorResource(R.color.warna_putih),
                fontSize = dimensionResource(
                    R.dimen.ukuran_nama
                ).value.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(telepon),
                color = colorResource(R.color.warna_biru_muda),
                fontSize = dimensionResource(
                    R.dimen.ukuran_detail
                ).value.sp
            )

            Text(
                text = stringResource(alamat),
                color = colorResource(R.color.warna_kuning),
                fontSize = dimensionResource(
                    R.dimen.ukuran_detail
                ).value.sp
            )
        }
    }
}
