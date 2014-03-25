package calendar;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		ResourceBundle rb=ResourceBundle.getBundle("messages");
		System.out.println("Língua: "+Locale.getDefault() + ", campo: " + rb.getString("saveButton"));
		
		
	}

}
2