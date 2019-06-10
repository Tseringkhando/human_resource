import Controller.HumanResourceController;
import Controller.LoginController;
import Model.Login;
import View.LoginView;

public class MainOperation {
	public static void main(String[] args) {
		Login model= new Login();
		LoginView view = new LoginView();
		LoginController con = new LoginController(view, model);
		con.loginData();
	}
}
