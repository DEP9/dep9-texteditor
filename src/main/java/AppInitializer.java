import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        URL resource = this.getClass().getResource("/view/SplashForm.fxml");
        Parent splashContrainer = FXMLLoader.load(resource);
        Scene splashscene = new Scene(splashContrainer);

        splashscene.setFill(Color.TRANSPARENT);
        Stage stage = new Stage(StageStyle.TRANSPARENT);

        stage.setScene(splashscene);
        stage.show();
        stage.centerOnScreen();

//        URL resource = this.getClass().getResource("/view/TextEditor.fxml");
//        Parent contariner = FXMLLoader.load(resource);
//        Scene editorScence = new Scene(contariner);
//        primaryStage.setScene(editorScence);
//        primaryStage.setTitle("Dep- Text Editor");
//        primaryStage.show();
//        primaryStage.centerOnScreen();

    }
}
