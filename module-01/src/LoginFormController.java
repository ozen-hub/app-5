import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public CheckBox cmbRememberMe;
    public RadioButton rBtnUser;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        System.out.println("Username : "+txtUserName.getText()+" - Password : "+txtPassword.getText());
        /*if (cmbRememberMe.isSelected()){
            System.out.println("Remember me state is ON");
        }else{
            System.out.println("Remember me state is OFF");
        }*/
        System.out.println(cmbRememberMe.isSelected()?"Remember me state is ON":"Remember me state is OFF");
       /* if (rBtnUser.isSelected()){
            System.out.println("This User type => (USER)");
        }else{
            System.out.println("This User type => (ADMIN)");
        }*/
        System.out.println(rBtnUser.isSelected()?"This User type => (USER)":"This User type => (ADMIN)");
    }
}
