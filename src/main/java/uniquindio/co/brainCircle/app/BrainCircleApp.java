package uniquindio.co.brainCircle.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BrainCircleApp extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(BrainCircleApp.class.getResource("/PanelAdmin.fxml"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("BrainCircle");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {launch(BrainCircleApp.class, args);}
}
