package by.itacademy.keikom.taskto6;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Logger objLog = Logger.getLogger();
		objLog.writeError("My Error, number one");
		
		//Thread.sleep(500);
		objLog.writeError("My Error, number two");
		
	}
}