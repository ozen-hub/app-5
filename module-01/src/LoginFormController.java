import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        System.out.println("Username : "+txtUserName.getText()+" - Password : "+txtPassword.getText());
    }
}
