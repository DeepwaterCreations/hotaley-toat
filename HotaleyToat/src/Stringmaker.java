/*
 * Copyright 2013 Dylan Craine
 * 
    This file is part of Hotaley Toat.

    Hotaley Toat is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Hotaley Toat is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Hotaley Toat.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 
 * Makes strings, just like it says on the lid. DUUUUH!
 * 0s are vowels, 1s are consonants.
 * 
 * @author Deepwater Creations 
 *
 */
public class Stringmaker {

	private String output;
	private Random whatever;
	//private static ArrayList<String> vowels = new ArrayList<String>();
	private static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u"); 
//			"ae", "ai", "ao", "au", 
//			"ea", "ee", "ei", "eo", "eu",
//			"ia", "ie", "io", "iu",
//			"oa", "oe", "oi", "oo", "ou",
//			"ua", "ue", "ui", "uo");
	private static List<String> consonants = Arrays.asList("b", "c", "d", "f", "g", 
			"h", "j", "k", "l", "m", "n", "p", "qu", "r", "s", "t", "v", "w", "x", "z");
//			"ng", "sh", "ch", "th", "sc", "ly", "br", "bl", "cr", "pl", "pr", "cl", "ck");
		
	public Stringmaker(String input){
		output = new String();
		whatever = new Random();
		
		for(char digit:input.toCharArray()){
			if(digit == '0') 
				output = addVowel(output);
			else if(digit == '1') 
				output = addConsonant(output);
			else{
				System.out.println("No, you fool! Ones and zeroes!");
				break;				
			} 
		}
	}
	
	public String addVowel(String output){
		int i = whatever.nextInt(vowels.size());
		output += vowels.get(i);
		return output;
	}
	
	public String addConsonant(String output){
		int i = whatever.nextInt(consonants.size());
		output += consonants.get(i);		
		return output;
	}

	public String getWord(){
		return output;
	}
}
