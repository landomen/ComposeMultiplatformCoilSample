package com.landomen.composemultiplatform.coil

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeMultiplatformCoilSample",
    ) {
        App()
    }
}