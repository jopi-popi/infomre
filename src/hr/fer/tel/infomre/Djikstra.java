/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.fer.tel.infomre;

import java.io.FileNotFoundException;

/**
 *
 * @author Josip
 */
public class Djikstra {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        try {
            Reader.readFile("Network.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
    }
}
