import java.io.File;
import java.util.*;

public class Search {

	void search() {
		String path="F:\\Training\\";
		String searchfile;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name to search:");
		searchfile = sc.nextLine();
        File f = new File(path);
      
        int flag=0;
        File filenames[] = f.listFiles();
        
        for(File ff:filenames) {
        	if(ff.getName().equals(searchfile)) {
        		flag=1;
        		break;
        	}
        	else {
        		flag=0;
        	}
        	
        }
        if(flag==1) {
        	System.out.println("File is found");
        }
        else {
        	System.out.println("File is not found");
        }
	}

}
