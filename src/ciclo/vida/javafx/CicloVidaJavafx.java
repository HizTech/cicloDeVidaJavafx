package ciclo.vida.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JorgeLPR
 */
public class CicloVidaJavafx extends Application {

    
    public CicloVidaJavafx() {
        System.out.println("metodo constructor() ");
    }

    @Override
    public void init(){
        System.out.println("metodo init() ");
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println("metodo start() ");
                
    }

    @Override
    public void stop(){
        System.out.println("metodo stop() ");        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
