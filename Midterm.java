import java.util.*;

public class Midterm {

	public static void main(String[] args) {
		
			String[] Gender = null;
			gender(Gender);
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
}
