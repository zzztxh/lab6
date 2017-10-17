package app;

import java.io.IOException;

import app.controller.GameBorderController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pkgCore.Player;
import pkgCore.Table;

public class Flamingo extends Application {
	
	private BorderPane GameBorderPane = null;
	private GameBorderController GBC = null;
	private Table GameTable = new Table();
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HandleRoot(primaryStage);

	}
	
	public void HandleRoot(Stage primaryStage) {
		Parent root;
		try {
						
			FXMLLoader loader = new FXMLLoader();			
			loader =  new FXMLLoader(getClass().getResource("/poker/app/view/GameBorder.fxml"));					
			GameBorderPane = (BorderPane) loader.load();
			Scene scene = new Scene(GameBorderPane);
			primaryStage.setScene(scene);
			GBC = loader.getController();
			GBC.setMainApp(this);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AddPlayerToTable(Player p)
	{
		GameTable.AddPlayerToTable(p);
	}


}
