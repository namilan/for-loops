import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int userNumber = input.nextInt();
		System.out.println("Great number. Now let's count");
		
		int i = 0;
		while ( i < 9) {
			System.out.println(i);
			i++;
		}
		System.out.println("I just counted to 8!");
		
		System.out.println("Now please enter a name:");
		String userName = input.next();
		String letter = "a";
		int numOfOccurences = userName.length() -
				userName.replaceAll(letter,  "").length();
		System.out.println("numOfOccurences= " +numOfOccurences);
		

				}
			
		
	}

