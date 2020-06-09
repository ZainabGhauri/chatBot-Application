/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatbot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Zainab Ghauri
 */
public class Chatbot extends Application {
    Parent root= null;
  
    @Override
    
    public void start(Stage stage) throws Exception {
        try {
        
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        }
        catch(Exception o)
        {
            
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
