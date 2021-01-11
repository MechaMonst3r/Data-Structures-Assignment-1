/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1excercise1;

/**
 *
 * @author work
 */
public class Lab1Excercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Production p1, p2, p3, p4, p5;
        p1 = new Production();
        p2 = new Film("Titanic", "James Cameron", "James Cameron", 2245);
        p3 = new Play("Bus Stop", "Harold Clurman", "William Inge", 478);
        p4 = new Musical("Jersey Boys", "Des McAnuff", "Marshall Brickman", 1008,
                 "Bob Gaudio", "Bob Crewe");
        p5 = new ActionFilm("Air Force One", "Wolfgang Petersen", "Wolfgang Petersen",
                    315, "Harrison Ford", 1997); 
        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
        System.out.println();
        p4.display();
        System.out.println();
        p5.display();
   }
}