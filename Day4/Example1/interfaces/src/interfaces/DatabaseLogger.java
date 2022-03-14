package interfaces;
//override implement etme methodudur
public class DatabaseLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Database loglandı : " + message);
		
	}

}
