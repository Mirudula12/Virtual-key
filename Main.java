import java.io.IOException;
import java.util.Scanner;

public class Javaproject {

	public static void main(String[] args) throws IOException {
		
		Addfile a = new Addfile();
		Display ds = new Display();
		Delete d = new Delete(); 
		Search s = new Search();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\n1.Display the file:");
			System.out.println("2.Add/Delete/Search a file:");
			System.out.println("3.Exit");
			System.out.println("\nEnter choice:");
			
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: ds.displayfile(); break;
			case 2: while(true) {
				System.out.println("\n1.Add a file:");
				System.out.println("2.Delete a file:");
				System.out.println("3.Search a file:");
				System.out.println("4.Exit");
				System.out.println("\nEnter choice:");
				
				int choice2 = sc.nextInt();
				
				switch(choice2) {
				case 1: a.add(); break;
				case 2: d.delete(); break;
				case 3: s.search(); break;
				case 4: System.exit(0); break;
				}

			}
			case 3: System.exit(0); break;
			}
		}
	}

}
