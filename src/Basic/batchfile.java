package Basic;

import java.io.File;
import java.io.IOException;

public class batchfile {
	public static void executeCmd() {
	   // String anyCommand="your command";
	    try {
	    	ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "kk.bat");
	    	File dir = new File("C:\\Users\\Provar Sourav\\Desktop");
	    	pb.directory(dir);
	    	Process p = pb.start();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		
		executeCmd();
		
	}
	
	
	}