package sandbox.controller.hoge;

import javafx.application.Application;
import javafx.stage.Stage;

public class HogeLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {

        /**
         * javaFXはmainメソッドが不要。
         * これだけで動いちゃう。
         */
        primaryStage.setTitle("Hoge Viewer");
        primaryStage.setWidth(200.0);
        primaryStage.setHeight(300.0);
        primaryStage.show();
    }
}
