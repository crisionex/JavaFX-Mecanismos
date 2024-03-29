package testsomething;

import animatefx.animation.FadeIn;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Ricardo Quilantan 2020
 * Facultad de Ciencias de la Ingeniería y Tecnología
 * ricardo.quilantan@uabc.edu.mx
 */
public class TestSomething extends Application {
    private double xOffset = 0;
    private double yOffset = 0;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("interfaz.fxml"));
        

             root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        
        
        Scene scene = new Scene(root);
        stage.setTitle("Caluladora Mecanismos Ricardo Quilantan");
        stage.initStyle(StageStyle.UNDECORATED);
       
        
        stage.setScene(scene);
        
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
