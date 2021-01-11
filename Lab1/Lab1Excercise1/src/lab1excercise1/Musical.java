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
public class Musical extends Play {
    
    private String composer;
    private String lyricist;
    
public Musical()
      {
       super();
       composer = "";
       lyricist = "";
      }

public Musical(String t, String d, String w, int p, String c, String l)
      {
        super(t, d, w, p);
        composer = c;
        lyricist = l;
      }

public String getComposer() 
      {
       return composer;
      }

public String getLyricist() 
      {
       return lyricist;
      }

public void setComposer(String composer)
      {
       this.composer = composer;
      }

public void setLyricist(String lyricist) 
      {
       this.lyricist = lyricist;
      }

public void display()
        {
         System.out.println("Title: "+ super.getTitle());
         System.out.println("Director: " + super.getDirector());
         System.out.println("Playwright: " + super.getWriter());
         System.out.println("Performances: " + super.getPerformances());
         System.out.println("Composer: " + composer);
         System.out.println("Lyricist: " + lyricist);
        }


}
