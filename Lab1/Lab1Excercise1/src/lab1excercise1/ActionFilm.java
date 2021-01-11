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
public class ActionFilm extends Film {
    
    String mainActor;
    int yearReleased;
    
public ActionFilm()
    {
     super();
     mainActor = "";
     yearReleased = 0;
    }

public ActionFilm(String t, String d, String w, int g, String m, int y)
    {
     super(t, d, w, g);
     mainActor = m;
     yearReleased = y;
    }

public String getMainActor()
    {
     return mainActor;
    }

public int getYearReleased()
    {
     return yearReleased;
    }

public void setMainActor(String mainActor) 
    {
     this.mainActor = mainActor;
    }

public void setYearReleased(int yearReleased)
    {
     this.yearReleased = yearReleased;
    }

public void display()
      {
       System.out.println("Title: "+ super.getTitle());
       System.out.println("Director: " + super.getDirector());
       System.out.println("Screenwriter: " + super.getWriter());
       System.out.println("Total gross: " + super.getBoxOfficeGross() + " million");
       System.out.println("Main Actor: " + mainActor);
       System.out.println("Year Released: " + yearReleased);
      }

    
}
