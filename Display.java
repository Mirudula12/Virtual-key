import java.io.File;
import java.util.Scanner;

public class Display {
	
	 public void displayfile() {
		  
		String path="F:\\Training\\";
		
        File f = new File(path);
      
        File filenames[] = f.listFiles();
        for(File ff:filenames) {
        	System.out.println(ff.getName());
        }
	   
	  
	}

}
