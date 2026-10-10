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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource


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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_kartu)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.deskripsi_logo),
                modifier = Modifier.size(
                    dimensionResource(R.dimen.ukuran_logo)
                )
            )

            Spacer(
                modifier = Modifier.width(
                    dimensionResource(R.dimen.jarak_logo)
                )
            )

            Column(modifier = Modifier.weight(1f)) {
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

            Spacer(
                modifier = Modifier.width(
                    dimensionResource(R.dimen.jarak_logo)
                )
            )

            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.deskripsi_logo),
                modifier = Modifier.size(
                    dimensionResource(R.dimen.ukuran_logo)
                )
            )
        }
    }
}
