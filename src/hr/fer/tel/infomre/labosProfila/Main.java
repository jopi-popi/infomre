package hr.fer.tel.infomre.labosProfila;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Reader reader = new Reader();
		
		try {
			reader.readFile("Network.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
