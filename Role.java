import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Role extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		ArrayList<String> choices = new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");

		String defaultOption = choices.get(4);
		@SuppressWarnings("unchecked")
		ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choices);
		choiceDialog.setTitle("Role");
		choiceDialog.setHeaderText("Pleae select your role.");
		@SuppressWarnings("unchecked")
		Optional<String> result = choiceDialog.showAndWait();
		
		String selected = result.get();

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Greeting");
		alert.setHeaderText("Welcome!");
		switch(selected) {
			case "Administrator":
				alert.setContentText("Welcome adminstrator!");
				break;
			case "Faculty":
				alert.setContentText("Welcome faculty!");
				break;
			case "Staff":
				alert.setContentText("Welcome staff!");
				break;
			case "Student":
				alert.setContentText("Welcome student!");
				break;
			case "Guest":
				alert.setContentText("Welcome guest!");
				break;
			default:
				alert.setContentText("Invlaid choices");

		}

		alert.show();
	
	}

	public static void main(String [] args) {
		launch(args);
	}
}
