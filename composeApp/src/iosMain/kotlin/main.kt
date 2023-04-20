import androidx.compose.ui.window.ComposeUIViewController
import com.community.world.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
