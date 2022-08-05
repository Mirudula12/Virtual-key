import java.io.File;
import java.io.IOException;
import java.util.*;

public class Addfile {
	
	void add() {
		String path="F:\\Training\\";
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String filename = sc.next();
        String finalpath = path + filename;
        File f = new File(finalpath);
        
        boolean b = false;
		try {
			b = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if(b!=true) {
        	System.out.println("File not created");
        }
        else {
        	System.out.println("File created");
        }
	 
	}

}
