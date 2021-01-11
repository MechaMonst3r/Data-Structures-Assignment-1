/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercise2;

/**
 *
 * @author work
 */
public class Lab1Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle2D r1 = new Rectangle2D(2, 2, 5.5, 4.9);
        
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        
        System.out.println("Does the Rectangle contain the specified points? " + 
                           r1.contains(3,3));
        
        System.out.println("Does the Rectangle contain the other rectangle? " +
                           r1.contains(new Rectangle2D(4, 5, 10.5, 3.2)));
        
        System.out.println("Do the Rectangles overlap? " + 
                           r1.overlaps(new Rectangle2D(3, 5, 2.3, 5.4)));
    }
    
}
