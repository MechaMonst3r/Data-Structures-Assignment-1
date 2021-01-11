/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercise3;

import java.util.Scanner;

/**
 *
 * @author work
 */
public class Lab1Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int run;
        String input;
        
        System.out.println("Enter the word you'd like to Jumble: ");
        input = scan.nextLine();
        
        MyString jumble = new MyString(input);
        
        System.out.println("Enter how many times you'd like to Jumble the word: ");
        run = scan.nextInt();
        
        
        
        while(counter < run)
             {
              System.out.println(jumble.permute());
              counter++;
             }
                
    }
    
}
