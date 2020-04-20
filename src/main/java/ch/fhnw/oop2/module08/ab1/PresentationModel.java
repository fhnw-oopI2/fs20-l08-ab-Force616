package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class PresentationModel {
	
	public SimpleStringProperty button;
	public SimpleStringProperty title;
	
	public void TextProperty() {
		button.setValue("Click");
		title.setValue("JFX");
	}

	public ObservableValue getButton() {
		return button;
	}

	public String getTitle() {
		return title.getValue();
	}
}
