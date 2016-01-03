package hr.fer.tel.infomre.labosProfila;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	public static void readFile(String fileName) throws FileNotFoundException {
		
		File file = new File(fileName);
		
		Scanner input = new Scanner(file);
		
		String chars;         //stores data read from file
		Character character;  //stores character converted from String
		char temp;            //primitive type of the value above
		int weight = 0;  		  //number read from files
		char currentNode = 0;
		char neighbourNode = 0;
		char connectivity = 0;
		int charsRead=1;      //number of characters read
		
		while (input.hasNextLine()) {
			chars = input.next();
			
			character = chars.charAt(0);
			
			temp = character;
			
			if (character.isDigit(temp)) {
				weight = Integer.parseInt(chars);
				System.out.println("Weight: " + weight);
			}
			if (charsRead == 1) {
				currentNode = temp;
				System.out.println("Current node: " + currentNode);
			}
			else if (charsRead == 2) {
				neighbourNode = temp;
				System.out.println("Neighbour node: " + neighbourNode);
			}
			else if(charsRead == 4) {
				connectivity = temp;
				System.out.println("Connectivity: " + connectivity);
			}
			
			
			if (charsRead == 4) {
				
				String values;
				StringBuilder sb = new StringBuilder();
				sb.append(neighbourNode);
				sb.append(weight);
				sb.append(connectivity);
				System.out.println(sb);
				
				charsRead=0;
				
			}
			
			charsRead++;
		}
		
		input.close();
		
		
	}
}
