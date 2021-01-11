package lab1exercise3;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */
public class MyString {
    
    private String word;
    
    public MyString()
       {
        word = "";
       }
    
    public MyString(String word)
       {
        this.word = word;   
       }
    
    public String permute()
       {
        Random rand = new Random();   
        char[] chars = word.toCharArray();
        int placement;
        char temp;
        int count = 0;
        String result;
       
       while(count != 2) 
         {  
            for(int i = 0; i < chars.length; i++)
               {
                placement = rand.nextInt(chars.length - 1); 
                temp = chars[i];
                chars[i] = chars[placement];
                chars[placement] = temp;
               }
            
            count++;
         } 
       
        return result = new String(chars);
       }
    
}
