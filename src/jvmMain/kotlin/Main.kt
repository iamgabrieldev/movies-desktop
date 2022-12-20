import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

        Column {
            Text("The Shawshank Redemption")
            Image(
                painter = painterResource("capa-filme.jpg"),
                contentDescription = "capa do filme",
                modifier = androidx.compose.ui.Modifier.height(240.dp)
            )
        }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
