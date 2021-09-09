import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class Basement {
	public static void main(String[] args) throws IOException {

		File read = new File("input_day1_1.txt");
//		File read = new File("test.txt");
		Scanner scan = new Scanner(read);
		
		String data = null;
    	
		while (scan.hasNext()) {
			data = scan.next();
		}
		scan.close();		
		System.out.println(data);
		
//		int length = (int) read.length();
//		System.out.println(length);
			
		int floor = 0;
		int i;
		for (i=1; i<=read.length(); i++) {
			char check = data.charAt(i-1);
			if (check == '(') floor += 1;
			else if (check == ')') floor -= 1;
			
			System.out.println(floor);
			
			if (floor == -1) break;
		}	

		System.out.println("Final floor = " + floor);
		System.out.println(i); 

	}
}
