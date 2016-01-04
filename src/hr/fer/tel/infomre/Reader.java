/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.fer.tel.infomre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Josip
 */
public class Reader {

    public static void readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);

        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String delims = "[, ]+";
            String[] tokens = line.split(delims);
            
            int currentNode = Integer.parseInt(tokens[0]);
            int neighbourNode = Integer.parseInt(tokens[1]);
            int weight = Integer.parseInt(tokens[2]);
            String connectivity = tokens[3];
            
            System.out.println("Current node: " + currentNode);
            System.out.println("Neighbour node: " + neighbourNode);
            System.out.println("Weight: " + weight);
            System.out.println("Connectivity: " + connectivity);
        }

        input.close();

    }
}
