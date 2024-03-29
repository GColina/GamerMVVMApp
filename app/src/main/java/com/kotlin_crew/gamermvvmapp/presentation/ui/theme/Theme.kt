package com.kotlin_crew.gamermvvmapp.presentation.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView

private val DarkColorScheme = darkColorScheme(
    primary = Red500,
    onPrimary = Color.White,
    secondary = Color.White,
    background = Darkgray900,
    surface = Red200,

    //onSecondary= Color.Blue,

    //tertiary = Color.Yellow,
    onSurface = Color.White


)
//primary: Color principal de la aplicación. Se usa en botones, barras de navegación, etc.
//secondary: Color secundario de la aplicación. Se usa en elementos complementarios, como iconos o fondos.
//onPrimary: Color que se usa para el texto y otros elementos sobre el color primary.
//onSecondary: Color que se usa para el texto y otros elementos sobre el color secondary.
//surface: Color del fondo de la aplicación.
//onSurface: Color que se usa para el texto y otros elementos sobre el color surface.
//error: Color de error de la aplicación. Se usa para mostrar errores o advertencias.

private val LightColorScheme = lightColorScheme(
    primary = Red500,
    onPrimary = Color.White,
    secondary = Color.White,
    background = Darkgray900,




    onSecondary= Color.Green,
    surface = Color.Green,
    tertiary = Color.Yellow,
    onSurface = Color.Green

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun GamerMVVMAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> DarkColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        /*SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }*/
    }

    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}