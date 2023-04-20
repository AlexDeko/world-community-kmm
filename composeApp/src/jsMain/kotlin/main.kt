import com.community.world.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("world-community-kmm") {
            App()
        }
    }
}
