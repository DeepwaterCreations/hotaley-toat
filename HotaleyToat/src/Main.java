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

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
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
