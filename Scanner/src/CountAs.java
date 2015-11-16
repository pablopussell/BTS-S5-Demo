import java.util.Scanner;

public class CountAs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please type any word to count the number of occurrences of 'A':");
		String aString=scanner.nextLine();
		scanner.close();
		aString = aString.toLowerCase();
		String stringWithoutAs = aString.replace("a", "");
		int CountAs = aString.length() - stringWithoutAs.length();
		System.out.println("The number of A's contained in the string: " + CountAs);

	}

}
