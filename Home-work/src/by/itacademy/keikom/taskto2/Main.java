package by.itacademy.keikom.taskto2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String args[]) {
		
		String result = new String();
		String str = "m12den s2r 5A";
		
		Pattern p = Pattern.compile("[0-9a-fA-F]+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			result = str.substring(m.start(), m.end());
			System.out.println(Integer.parseInt(result, 16));
		}
	}

}
