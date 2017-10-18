import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

public class RoleComboFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		ObservableList<String> options = FXCollections.observableArrayList("Administrtor", "Faculty", "Staff", "Student", "Guest");
		Label welcomeLabel = new Label("Select your role!");
		ComboBox<String> combobox= new ComboBox<>(options);
		combobox.setValue("Guest");
		combobox.setOnAction(e->{ 
			welcomeLabel.setText("Welcome " + combobox.getValue());
		});
		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(welcomeLabel, combobox);
		Scene scene = new Scene(pane,250,50);
		primaryStage.setTitle("Role Screen");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

