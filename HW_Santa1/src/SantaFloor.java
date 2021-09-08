import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
//import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files

public class SantaFloor {
	public static void main(String[] args) {
		try {
			File read = new File("input_day1_1.txt");
//			File myObj = new File("test.txt");
			Scanner scan = new Scanner(read);
			
			String data = null;
    	
			try {
				while (scan.hasNext()) {
				data = scan.next();
				}
			} finally {
				scan.close();
			}
			
//			scan.close();	//finally
			System.out.println(data);
			
			
			int floor = 0;
//			int length = (int) read.length();
			
//			for (int i = 0; i<length; i++) {
//				if (data.charAt(i) == '(') floor += 1;
//				else if (data.charAt(i) == ')') floor -= 1;
//				System.out.println(floor);
//			}
			
			int i = 0;
			while (i<read.length()) {
				char check = data.charAt(i);
				if (check == '(') floor += 1;
				else if (check == ')') floor -= 1;
				i++;
			}
			
			System.out.println("Final floor = " + floor);
			
			
//			while (myReader.hasNext()) {
//				
//				String data = myReader.next();
//				System.out.println(data);
//			}
//			myReader.close();
      
			
//      int length = (int)myObj.length();
//      for(int i = 0; i<=length; i++) {
//    	  c = myReader.next().charAt(0);
//    	  System.out.println("c = " + c);
//    }
//      c = myReader.read();
//	  System.out.println("c = " + c);
      
//      while(myObj.read() != -1) {
//    		sb.append(myObj.read());
//    	}
//      String contents = sb.toString();
//      System.out.println(contents);
//      
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} 
	}
}