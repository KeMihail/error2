package by.itacademy.keikom.taskto5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(new Locale("de", "De"));
		String language = args[0];
		String country = args[1];
		
		Locale loc = new Locale(language, country);
		
		ResourceBundle rb = ResourceBundle.getBundle("Message",loc);
		System.out.println(rb.getString("hello"));
		

	}

}
