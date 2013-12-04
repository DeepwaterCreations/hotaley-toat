/**
 * 
 * Makes strings, just like it says on the lid. DUUUUH!
 * 0s are vowels, 1s are consonants.
 * TODO: Dipthongs, consonant combos.
 * 
 * @author Dylan Craine
 *
 */
public class Stringmaker {

	private String output;
	
	public Stringmaker(String input){
		for(char digit:input.toCharArray()){
			if(digit == '0') 
				addVowel(output);
			else if(digit == '1') 
				addConsonant(output);
			else{
				System.out.println("No, you fool! Ones and zeroes!");
				break;				
			} 
		}
	}
	
	public void addVowel(String output){
		
	}
	
	public void addConsonant(String output){
		
	}

	public String getWord(){
		return output;
	}
}
