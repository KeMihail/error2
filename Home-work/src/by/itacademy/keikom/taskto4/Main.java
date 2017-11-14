package by.itacademy.keikom.taskto4;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
	public static void main(String args[])  {
		
		Locale loc = new Locale("uk","UA");
		
		NumberFormat numFor = NumberFormat.getCurrencyInstance(loc);
		System.out.println(numFor.format(153.5));
	}

}
