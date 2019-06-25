
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class CadastroClienteController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField nome;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    private TextField senha;

    @FXML
    private Button botaoconfirma;

    @FXML
    private Label alerta;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
