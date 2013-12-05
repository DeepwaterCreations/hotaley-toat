import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ears = new Scanner(System.in);		
		String input = new String();
		
		System.out.println("Enter 1s and 0s.");
		input = ears.nextLine();
		Stringmaker stringmaker = new Stringmaker(input);
		
		String output = stringmaker.getWord();		
		if(!output.isEmpty()) 
			System.out.println(output);
		else
			System.out.println("Empty output.\n");
	
	}
}
