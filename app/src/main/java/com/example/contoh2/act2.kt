import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.contoh2.ui.theme.Contoh2Theme

@Composable
fun ContohColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp)
    ) {
        Text("Hello")
        Text("World")
    }
}

@Composable
fun ContohRow(modifier: Modifier = Modifier) {
    val kota = stringResource(id = R.string.kota)
    Row(
        modifier = modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Hello")
        Text(text = kota)
    }
}



@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth().padding(top = 10.dp, start = 10.dp, end = 10.dp)) {
        // Baris 1
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        // Baris 2
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}



@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")

        }
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.notasinaton)
    Column(modifier = modifier) {
    }
}

