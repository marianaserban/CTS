package serbanpreda.mariana.g1087.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	String mesaj;
	
	private static Logger logger=null;
	
	private Logger() throws IOException {
	}
	
	private Logger(String mesaj) {
		this.mesaj=mesaj;
	}
	
	public static synchronized Logger getInstance() throws IOException {
		if(logger==null) {
			logger=new Logger();
		}
		return logger;
	}
	
	public void showLog(String mesaj) throws IOException {
		System.out.print("Scriere in fisier .txt: "+mesaj);
	}
}
