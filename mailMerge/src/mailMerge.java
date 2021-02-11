import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String firstName = " ";
		String lastName = " ";
		String houseNumber = " ";
		String street = " ";
		String answer = " ";
		
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		System.out.println(promptText1);
		firstName = in.nextLine();
		replaceText1 = replaceText1.replace("<firstName>", firstName);
		
		System.out.println(promptText2);
		lastName = in.nextLine();
		replaceText1 = replaceText1.replace("<lastName>", lastName);
		
		System.out.println(promptText3);
		houseNumber = in.nextLine();
		replaceText2 = replaceText2.replace("<houseNumber>", houseNumber);
		
		System.out.println(promptText4);
		street = in.nextLine();
		replaceText2 = replaceText2.replace("<street>", street);
		
		System.out.println(promptText5);
		answer = in.next();
		replaceText3 = replaceText3.replace("<yORn>", answer);
		
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		System.out.println(replaceText3);
		
	}

}
