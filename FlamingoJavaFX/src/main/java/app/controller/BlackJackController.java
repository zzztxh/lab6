package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Flamingo;
import javafx.fxml.Initializable;
import pkgCore.GamePlay;
import pkgCore.Table;

public class BlackJackController implements Initializable {
	private Flamingo FlamingoGame;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
	public void setMainApp(Flamingo FlamingoGame)
	{
		this.FlamingoGame = FlamingoGame;
	}

	public void HandleTableState(Table t) {

	}

	public void HandleGameState(GamePlay gp) {

	}

}
