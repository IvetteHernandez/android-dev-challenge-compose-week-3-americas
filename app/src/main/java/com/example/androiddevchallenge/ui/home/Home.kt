/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.elevation
import com.example.androiddevchallenge.ui.theme.green

@Composable
fun Home(onTap: () -> Unit = {}) {
    Scaffold(
        bottomBar = {
            Button(
                onClick = onTap,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.surface
                ),
                shape = MaterialTheme.shapes.large,
            ) {
                Text(
                    "Positions",
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onSurface,
                )
            }
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BottomNavigation(
                elevation = 0.dp,
                backgroundColor = Color.Transparent
            ) {

                BottomNavigationItem(
                    icon = {},
                    label = {
                        Text(
                            "ACCOUNT",
                            style = MaterialTheme.typography.button,
                            color = MaterialTheme.colors.onBackground,
                        )
                    },
                    selected = true,
                    onClick = {}
                )
                BottomNavigationItem(
                    icon = {},
                    label = {
                        Text(
                            "WATCHLIST",
                            style = MaterialTheme.typography.button,
                            color = MaterialTheme.colors.onBackground,
                        )
                    },
                    selected = false,
                    onClick = {}
                )
                BottomNavigationItem(
                    icon = {},
                    label = {
                        Text(
                            "PROFILE",
                            style = MaterialTheme.typography.button,
                            color = MaterialTheme.colors.onBackground,
                        )
                    },
                    selected = false,
                    onClick = {}
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Balance",
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.paddingFromBaseline(top = 32.dp, bottom = 8.dp)
            )
            Text(
                text = "$73,589.01",
                style = MaterialTheme.typography.h1,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.paddingFromBaseline(48.dp, 24.dp)
            )
            Text(
                text = "+412.35 today",
                style = MaterialTheme.typography.subtitle1,
                color = green,
                modifier = Modifier.paddingFromBaseline(16.dp, 32.dp)
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary
                ),
                shape = MaterialTheme.shapes.large,
            ) {
                Text(
                    "TRANSACT",
                    style = MaterialTheme.typography.button,
                    color = MaterialTheme.colors.onPrimary,
                )
            }

            Spacer(modifier = Modifier.height(16.dp))


            LazyRow(
                content = {
                    item {
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                    item {
                        OptionsButton {
                            Text(
                                "Week",
                                style = MaterialTheme.typography.button,
                                color = MaterialTheme.colors.primary,
                            )
                        }
                    }
                    item {
                        OptionsButton {
                            Text(
                                "ETFs",
                                style = MaterialTheme.typography.button,
                                color = MaterialTheme.colors.primary,
                            )
                        }
                    }
                    item {
                        OptionsButton {
                            Text(
                                "Stock",
                                style = MaterialTheme.typography.button,
                                color = MaterialTheme.colors.primary,
                            )
                        }
                    }
                    item {
                        OptionsButton {
                            Text(
                                "Funds",
                                style = MaterialTheme.typography.button,
                                color = MaterialTheme.colors.primary,
                            )
                        }
                    }
                    item {
                        OptionsButton {
                            Text(
                                "Other",
                                style = MaterialTheme.typography.button,
                                color = MaterialTheme.colors.primary,
                            )
                        }
                    }
                }
            )
            Image(
                painterResource(R.drawable.ic_home_illos),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
            )

        }
    }
}

@Composable
fun OptionsButton(
    content: @Composable () -> Unit
) {
    OutlinedButton(
        onClick = {},
        modifier = Modifier
            .height(40.dp)
            .padding(start = 4.dp, end = 4.dp),
        border = BorderStroke(
            ButtonDefaults.OutlinedBorderSize,
            color = MaterialTheme.colors.onBackground
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.large,
    ) {
        content()
    }
}
