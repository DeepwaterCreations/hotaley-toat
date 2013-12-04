import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ears = new Scanner(System.in);		
		String output = new String();
		String input = new String();
		
		System.out.println("Enter 1s and 0s.");
		input = ears.nextLine();
		Stringmaker stringmaker = new Stringmaker(input);
		
		
		if(!output.isEmpty()) 
			System.out.println(stringmaker.getWord());
	
	}
}
