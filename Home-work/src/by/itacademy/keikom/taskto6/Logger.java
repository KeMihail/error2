package by.itacademy.keikom.taskto6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Logger {
	
	private static Logger instance;
	Integer idError = 0;
	private Logger(){}

	public static Logger getLogger() {
		
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	public void writeError(String error) {
		
		Calendar dateAndTimeError = new GregorianCalendar();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL,new Locale("ru", "RU"));
		
		File dir = new File("D:\\ErrorToTast6");
		dir.mkdir();
		File file = new File (dir,"Error.txt");
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		try (FileWriter fr = new FileWriter(file,true)){
			fr.write("Дата и время ошибки: ");
			fr.write(df.format(dateAndTimeError.getTime()));
			fr.write(". Информация о ошибке: ");
			fr.write(error);
			fr.write("\r\n");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
