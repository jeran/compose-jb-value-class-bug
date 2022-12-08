import androidx.compose.foundation.text.BasicText
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("") {
            BasicText(text = "Hello cold world")
        }
    }
}
