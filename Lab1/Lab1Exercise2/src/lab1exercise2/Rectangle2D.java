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
public class Rectangle2D {
    
  double xpos, ypos, width, height;
    
  public Rectangle2D()
      {
       xpos = 0.0;
       ypos = 0.0;
       width = 0.0;
       height = 0.0;  
      }

  public Rectangle2D(double xpos, double ypos, double width, double height)
      {
       this.xpos = xpos;
       this.ypos = ypos;
       this.width = width;
       this.height = height;         
      }

  public double getXpos() 
      {
       return xpos;
      }

  public double getYpos()
      {
       return ypos;
      }

  public double getWidth()
      {
       return width;
      }

  public double getHeight()
      {
       return height;
      }

  public void setXpos(double xpos)
      {
       this.xpos = xpos;
      }

  public void setYpos(double ypos)
      {
       this.ypos = ypos;
      }

  public void setWidth(double width)
      {
       this.width = width;
      }

  public void setHeight(double height)
      {
       this.height = height;
      }
  
  public double getArea()
      {
       return width*height;   
      }
  
  public double getPerimeter()
      {
       return 2*(width + height);  
      }

  public boolean contains(double x, double y)
      {
       if(xpos <= x && x <= xpos + width && ypos <= y &&
          y <= ypos + height)
         {
          return true;   
         }

       return false;
      }
  
  public boolean contains(Rectangle2D r)
      {
        if(xpos <= r.getXpos() && r.getXpos() + r.getWidth() < (xpos + width) &&
           ypos <= r.getYpos() && r.getYpos() + r.getHeight() < (ypos + height))
          {
           return true;   
          }
        
       return false; 
      }
  
  public boolean overlaps(Rectangle2D r)
      {
       if(xpos < r.getXpos() + r.getWidth() && xpos + width > r.getXpos() &&
          ypos < r.getYpos() + r.getHeight() && ypos + height > r.getYpos())
         {
          return true;   
         }
       
       return false;
      }

    
}
