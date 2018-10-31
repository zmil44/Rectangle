/*
 * Zachary Miller
 * Assignment 9.3
 * The purpose of this program is to create the class MyRectangle to be used for creating instances of the rectangles in CreateRectange.java  
 * 25 Oct 2017
 * Bellevue University
 * MyRectangle.java
 */
public class MyRectangle{

  private double width = 1.0;
  private double height = 1.0;
  private static String color = "white";

  public MyRectangle(){
	  
  }

  public MyRectangle(double widthParam, double heightParam, String colorParam){ 
	  
	  setWidth(widthParam);
	  setHeight(heightParam);
	  setColor(colorParam);
	  findArea();
  }

  public double getWidth(){ 
	  return width;
  }

  public void setWidth(double widthParam){
	  width=widthParam;
  }

  public double getHeight(){
	  return height;
  }

  public void setHeight(double heightParam){
	  height=heightParam;
  }

  public String getColor(){
	  return color;
  }  

  public static void setColor(String colorParam){ 
	  color=colorParam;
  }

  public double findArea(){
	  double area = getHeight()*getWidth();
	  return area;
  }
  public String toString()
  {
	    return "width = " + width + " height = " + height + " color = " + color;
  }

}