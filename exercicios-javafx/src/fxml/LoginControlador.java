package fxml;



import javax.management.Notification;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	 
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
		
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com");
		boolean senhaValida = campoSenha.getText().equals("235689");

		if(emailValido && senhaValida) {
			Notification.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Login efetuado com sucesso!")
			.showInformation();
			
		
			
		} else {
			
			
			
			Notification.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Login efetuado com sucesso!")
			.showError();
			
		}		
	}
	
}
