/* CountVowels
 * 
 * Enter a string and the program counts the number of vowels in the text. 
 * Also, reports the sum of each vowel found.
 * 
 * by Carlos F. Meneses
 * Created: 04/06/2019
 * Modified: 04/07/2019
 * 
 */
package countVowels;

import java.util.Scanner;

/**
 * The Class CountVowels.
 */
public class CountVowels {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String userString = getUserString("Enter text: ");
		int[] vowelCount = countVowels(userString);
		display(vowelCount);
		System.exit(0);

	}

	/**
	 * Displays instruction and gets user input.
	 *
	 * @param display instruction to display
	 * @return the user string
	 */
	private static String getUserString(String display) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print(display);
		String userString = myScanner.nextLine();
		myScanner.close();
		
		return userString;
	}

	/**
	 * Counts each vowel in a given string.
	 *
	 * @param theString the string which vowels will be counted
	 * @return the object array
	 */
	private static int[] countVowels(String theString) {
		int[] count = {0, 0, 0, 0, 0};
		String theStringLC = theString.toLowerCase();
		char theChar;
		
		for (int i = 0; i <= (theString.length()) - 1; i++) {
			theChar = (theStringLC.charAt(i));
			
			switch (theChar) {
			case 'a':
				count[0]++;
				break;

			case 'e':
				count[1]++;
				break;

			case 'i':
				count[2]++;
				break;

			case 'o':
				count[3]++;
				break;

			case 'u':
				count[4]++;
				break;

			default:
				break;
			}
		}
		return count;
	}

	/**
	 * Displays the report of the sum of each vowel found.
	 *
	 * @param vowelCount the vowel count
	 */
	private static void display(int[] vowelCount) {
		int totalVowels = vowelCount[0] + vowelCount[1] + vowelCount[2] + vowelCount[3] + vowelCount[4];
		
		System.out.println("\n" + totalVowels + " vowel(s) found.\n");
		System.out.println("A's: " + vowelCount[0]);
		System.out.println("E's: " + vowelCount[1]);
		System.out.println("I's: " + vowelCount[2]);
		System.out.println("O's: " + vowelCount[3]);
		System.out.println("U's: " + vowelCount[4]);

	}

}
