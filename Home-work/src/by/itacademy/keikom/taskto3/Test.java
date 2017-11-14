package by.itacademy.keikom.taskto3;

public class Test {

	public static void main(String[] args) {
		
		String str = "<p align=\"center\" id=\"paragraf\">любой текст</p>"
				+ "<p align=\"center\"> ТЕКСТ </p> "
				+ "<p style=\"color:#00FF00\">ЗАДАЕМ ЦВЕТА ТЕКСТА</p>"
				+ "<p>Просто тег<p>";

		System.out.println(str.replaceAll("<p[^>]+>", "<p>"));
	}

}
