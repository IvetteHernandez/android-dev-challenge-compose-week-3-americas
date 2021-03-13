package com.example.androiddevchallenge.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.red


sealed class Position(
    val price: String,
    val percentage: String,
    val id: String,
    val name: String,
    @DrawableRes val image: Int
) {
    object Position1 :
        Position(
            price = "$7,918",
            percentage = "-0.54%",
            id = "ALK",
            name = "Alaska Air Group",
            image = R.drawable.ic_home_alk
        )

    object Position2 :
        Position(
            price = "$1,293",
            percentage = "+4.18%",
            id = "BA",
            name = "Boeing Co.",
            image = R.drawable.ic_home_ba
        )

    object Position3 :
        Position(
            price = "$893,50",
            percentage = "-0.54%",
            id = "DAL",
            name = "Delta Airlines Inc.",
            image = R.drawable.ic_home_dal
        )

    object Position4 :
        Position(
            price = "$12,301",
            percentage = "+2.51%",
            id = "EXPE",
            name = "Expedia Group Inc.",
            image = R.drawable.ic_home_exp
        )

    object Position5 :
        Position(
            price = "$12,301",
            percentage = "+1.38%",
            id = "EADSY",
            name = "Airbus SE",
            image = R.drawable.ic_home_eadsy
        )

    object Position6 :
        Position(
            price = "$8,521",
            percentage = "+1.56%",
            id = "JBLU",
            name = "Jetblue Airways Corp.",
            image = R.drawable.ic_home_jblu
        )

    object Position7 :
        Position(
            price = "$521",
            percentage = "+2.75%",
            id = "MAR",
            name = "Marriott Internacional Inc.",
            image = R.drawable.ic_home_mar
        )

    object Position8 :
        Position(
            price = "$5,481",
            percentage = "+0.14%",
            id = "CCL",
            name = "Carnival Corp",
            image = R.drawable.ic_home_ccl
        )

    object Position9 :
        Position(
            price = "$9,184",
            percentage = "+1.69%",
            id = "RCL",
            name = "Royal Caribbean Cuises",
            image = R.drawable.ic_home_rcl
        )

    object Position10 :
        Position(
            price = "$654",
            percentage = "+3.23%",
            id = "TRVL",
            name = "Travelocity Inc.",
            image = R.drawable.ic_home_trvl
        )
}

val positions = listOf(
    Position.Position1,
    Position.Position2,
    Position.Position3,
    Position.Position4,
    Position.Position5,
    Position.Position6,
    Position.Position7,
    Position.Position8,
    Position.Position9,
    Position.Position10,
)

@Composable
fun HomePositions() {
    Surface(color = MaterialTheme.colors.surface) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "Positions",
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier.paddingFromBaseline(bottom = 24.dp)
            )
            LazyColumn(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                items(positions) { position ->
                    Card(position)
                }
            }

        }
    }
}

@Composable
fun Card(position: Position) {
    Column {
        Divider(color = MaterialTheme.colors.onSurface)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    position.price,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    position.percentage,
                    style = MaterialTheme.typography.body1,
                    color = if (position.percentage[0] == '+') green else red,
                )
            }
            Column {
                Text(
                    position.id,
                    style = MaterialTheme.typography.h3,
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    position.name,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface,
                )
            }

            Image(
                painter = painterResource(id = position.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier

            )
        }

    }
}