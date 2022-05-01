Part 3: Checking if the Triangle is an Isosceles Triangle or Scalene or Equilateral Triangle
//
A triangle, is plane-sided three sides and three angles in whatever length or angle it may be.
//but sum-it-up to 180 degrees.

import java.util.Scanner;
class AreaOfTriangle 
{
public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
         System.out.println("Enter the width of the Triangle:");
         double b= s.nextDouble();
 
         System.out.println("Enter the height of the Triangle:");
          double h= s.nextDouble();
 
                  //Area = (width*height)/2
      double area=(b*h)/2;
      System.out.println("Area of Triangle is: " + area);      
   }   
}
