import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("") {
            Broken()
//            Okay(Role.RadioButton)
//            Broken(role = Role.RadioButton) // okay
        }
    }
}

@Composable
fun Broken(role: Role = Role.RadioButton) {

}

@Composable
fun Okay(role: Role) {

}

//@Composable
//fun AlsoBroken(role: Role) {
//    Box(
//        modifier = Modifier
//            .selectable(
//                selected = true,
//                interactionSource = remember { MutableInteractionSource() },
//                indication = null,
//                role = role,
//                onClick = { },
//            ),
//    )
//}
