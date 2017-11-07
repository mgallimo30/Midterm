import java.util.*;
import java.io.*;

public class Midterm {
	private static String[] team;
	private static Double score; 
	
	public static void main(String[] args) {
		
			String[] Gender = null; //Assumes this will hold "men" or "women"
			gender(Gender);
			Double[] team2 = {0.00, 1.00, 2.00, 3.00, 4.00 }; //Assumes this will hold the teams personality type and number if members 
			try {
				output();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	private static int gender(String[] gender) {
		Integer[] averageGender = {null};
		int i = 0, average = 0;
		do {
		if (gender[i].compareToIgnoreCase("men") == 0) {
			averageGender[i] = 0;
			i++;
		}
		else if (gender[i].compareToIgnoreCase("women") == 0) {
			averageGender[i] = 1;
			i++;
		} else {
			
		}
		} while (checkforgender(averageGender) == true);
		for (int j = 0; j < averageGender.length; j ++) {
			average += averageGender[j];
		}
		return average /= (averageGender.length + 1);
	}

	private static boolean checkforgender(Integer[] averageGender) {
		for (int i = 0; i < averageGender.length; i++) {
			if (averageGender[i] == null)
				return true; 
		}
		return false;

	}
	
	@SuppressWarnings("unused")
	private static void personality_type () {
		
		
	}
		
	public static void output() throws IOException {
		
		
	System.out.print("Enter input file: ");
	 FileInputStream in = null;
     FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
      System.out.print(out);
      System.out.print("Score: "+ score);
      for (int i = 0; i <= 4; i++) {
      System.out.print("Team " + (i + 1) + ": "+ team[i]);
      }
      System.out.print("Developed by Nick Cecilia, Matt Gallimo\nExecution Time: "+ System.nanoTime());
      
      
      
}
}
