import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Midterm {
	private static String[] team;
	private static Double maximumScoreAllowed; 
	
	public static void main(String[] args) {
		
			getFile();
			String[] Gender = {"men"}; //Assumes this will hold "men" or "women"
			gender(Gender);
			Double[] team2 = {0.00, 1.00, 2.00, 3.00, 4.00 }; //Assumes this will hold the teams personality type and number if members 
/*			try {
				output();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	}

	private static void getFile() {
		
		System.out.print("Enter input file: ");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		
        // The name of the file to open.
        String fileName = input + ".txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

/*            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   */
            
           maximumScoreAllowed =  Double.parseDouble(line = bufferedReader.readLine());
            
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
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
		
/*	public static void output() throws IOException {
		
		
	System.out.print("Enter input file: ");
	Scanner in = new Scanner(System.in);
	String input = in.next();
	
	 FileInputStream in2 = null;
     FileOutputStream out = null;

      try {
       //  in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in2.read()) != -1) {
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
*/}
