package midterm;
import java.util.*;
import java.io.*;

public class output {

	public static void main(String[] args)throws IOException {
		
		output(); 
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
	      System.out.print("Team 1: "+ team1);
	      System.out.print("Team 2: "+ team2);	
	      System.out.print("Team 3: "+ team3);
	      System.out.print("Team 4: "+ team4);
	      System.out.print("Team 5: "+ team5);
	      System.out.print("Developed by Nick Cecilia, Matt Gallimo\nExecution Time: "+ System.nanoTime());
	      
	      
	      
	}

	
}
