package mx.edu.uthermosillo.a21311118.comandas

// Extensions.kt
import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment

fun Activity.setStatusBarColor(@ColorInt color: Int) {
    window.statusBarColor = color
}

fun Activity.setNavigationBarColor(@ColorInt color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.navigationBarColor = color
    }
}

fun Fragment.setStatusBarColor(@ColorInt color: Int) {
    activity?.setStatusBarColor(Color.RED)
}

fun Fragment.setNavigationBarColor(@ColorInt color: Int) {
    activity?.setNavigationBarColor(Color.BLUE)
}
