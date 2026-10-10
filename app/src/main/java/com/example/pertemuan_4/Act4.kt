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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


@Composable
fun ActivitasPertama(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(
                horizontal = dimensionResource(
                    R.dimen.padding_halaman
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.jarak_atas)
            )
        )

        Text(
            text = stringResource(R.string.prodi),
            color = colorResource(R.color.warna_hitam),
            fontSize = dimensionResource(
                R.dimen.ukuran_judul
            ).value.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(R.string.univ),
            color = colorResource(R.color.warna_hitam),
            fontSize = dimensionResource(
                R.dimen.ukuran_universitas
            ).value.sp
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.jarak_judul)
            )
        )

        CardProfil(
            nama = R.string.nama_1,
            telepon = R.string.telepon_1,
            alamat = R.string.alamat_1,
            warna = R.color.warna_kartu_1,
            namaMiring = true
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.jarak_kartu)
            )
        )

        CardProfil(
            nama = R.string.nama_2,
            telepon = R.string.telepon_2,
            alamat = R.string.alamat_2,
            warna = R.color.warna_kartu_2
        )

        Spacer(
            modifier = Modifier.height(
                dimensionResource(R.dimen.jarak_kartu)
            )
        )

        CardProfil(
            nama = R.string.nama_3,
            telepon = R.string.telepon_3,
            alamat = R.string.alamat_3,
            warna = R.color.warna_kartu_3
        )
    }
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
