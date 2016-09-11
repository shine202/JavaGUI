/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Shkelqim
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Menu mMenuFile;
    @FXML
    private MenuItem mItemClose;
    @FXML
    private Menu mMenuEdit;
    @FXML
    private MenuItem mItemDelete;
    @FXML
    private Menu mMenuHelp;
    @FXML
    private MenuItem mItemAbout;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
