import java.io.File;
import java.util.Scanner;

public class Delete {

	void delete() {
		
		String path="F:\\Training\\";
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String filename = sc.next();
        String finalpath = path + filename;
        File f = new File(finalpath);
        
        f.delete();
        System.out.println("File deleted");
        

	}

}
