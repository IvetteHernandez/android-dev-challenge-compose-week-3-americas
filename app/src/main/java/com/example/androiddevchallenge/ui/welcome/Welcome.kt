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
package com.example.androiddevchallenge.ui.welcome

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
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Welcome(onTapLogin: () -> Unit = {}) {
    Surface(color = MaterialTheme.colors.background) {
        Box {
            Image(
                painterResource(R.drawable.ic_welcome_bg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(start = 16.dp, end = 16.dp, top = 32.dp, bottom = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Spacer(modifier = Modifier.height(48.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = null
                )
                Row {
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .fillMaxWidth(0.5f)
                            .height(48.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.primary
                        ),
                        shape = MaterialTheme.shapes.large,
                    ) {
                        Text(
                            "GET STARTED",
                            style = MaterialTheme.typography.button,
                            color = MaterialTheme.colors.onPrimary,
                        )
                    }
                    OutlinedButton(
                        onClick = onTapLogin,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .fillMaxWidth(1f)
                            .height(48.dp),
                        border = BorderStroke(
                            ButtonDefaults.OutlinedBorderSize,
                            MaterialTheme.colors.primary
                        ),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color.Transparent,
                        ),
                        shape = MaterialTheme.shapes.large,
                    ) {
                        Text(
                            "LOG IN",
                            style = MaterialTheme.typography.button,
                            color = MaterialTheme.colors.primary,
                        )
                    }
                }
            }
        }
    }
}