package sandbox.controller.hoge

import javafx.application.Application
import javafx.stage.Stage

class HogehogeApplication : Application() {

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Hoge Viewer"
        primaryStage.width = 200.0
        primaryStage.height = 300.0
        primaryStage.show()
    }
}