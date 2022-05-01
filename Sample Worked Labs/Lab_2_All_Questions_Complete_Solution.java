Read three pairs of points (xi,yi) from the keyboard.
        a) Check if the three pairs of points (xi,yi) form a triangle.
        b) Check if it is a rectangular, isosceles or equilateral triangle.
        c) Calculate the area of the triangle if it is possible. Given by the determinant of the matrix of the three sides.

        Checking if the Triangle is an Isosceles Triangle or Scalene or Equilateral Triangle
        Remembering that;
//Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is equilateral only if X = Y = Z.
//Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is isosceles if either X = Y or X = Z or Y = Z.
//A scalene triangle: A scalene triangle is a triangle that has no equal sides. None of its three sides are equal to each other and it has no equal angles either. Then, the triangle is isosceles if either X = Y and X = Z and Y = Z.


// Part 1:
// We will check if the input of the three points is of a triangle
//a) Check if the three pairs of points (xi,yi) form a triangle.
import java.util.Scanner;
public class Lab_02_1_DrawTriangle {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("x= ");
        double x=input.nextDouble();
        System.out.print("y= ");
        double y=input.nextDouble();
        input.close();

        drawTriangle(point 1, point 2, point 3) {
            for(int x = 1.x, x <= 2.x, x++){
                for(int y = 1.y, y <= 2.y, y++){
                    drawPoint(x, y);
                }
            }
            for(int x = 1.x, x <= 3.x, x++){
                for(int y = 1.y, y <= 3.y, y++){
                    drawPoint(x, y);
                }
            }
            for(int x = 2.x, x <= 3.x, x++){
                for(int y = 2.y, y <= 3.y, y++){
                    drawPoint(x, y);
                }
            }
        }
//Part 2: Checking if the Triangle is an Isosceles Triangle or Scalene or Equilateral Triangle
//Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is equilateral only if X = Y = Z.
//Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is isosceles if either X = Y or X = Z or Y = Z.
//A scalene triangle: A scalene triangle is a triangle that has no equal sides. None of its three sides are equal to each other and it has no equal angles either. Then, the triangle is isosceles if either X = Y and X = Z and Y = Z.
//Using example of the following input values;
// Input: X = 6, Y = 8, Z = 10
//Output: Scalene Triangle
//Explanation: Since all the sides of the given triangle are unequal, the triangle is scalene.
//Input: X = 10, Y = 10, Z = 10
//Output: Equilateral Triangle
//Explanation: Since all the sides of the given triangle are equal.
// Given sides of triangle
        int x = 8, y = 7, z = 9;

        // Function call
        checkTriangle(x, y, z);


import java.util.Scanner;
        public class Lab_02_2_CheckTriangle {

            public static static void checkTriangle(int x, int y, int z)
            {
                Scanner input=new Scanner(System.in);
                System.out.print("x= ");
                double x=input.nextDouble();
                System.out.print("y= ");
                double y=input.nextDouble();
                System.out.print("z= ");
                double z=input.nextDouble();
                input.close();

                // Check for equilateral triangle
                if (x == y && y == z )
                    System.out.println("Equilateral Triangle");

                    // Check for isosceles triangle
                else if (x == y || y == z || z == x )
                    System.out.println("Isosceles Triangle");

                    // Otherwise scalene triangle
                else
                    System.out.println("Scalene Triangle");
            }


//Part 3: Checking if the Triangle is an Isosceles Triangle or Scalene or Equilateral Triangle
//A triangle, is plane-sided three sides and three angles in whatever length or angle it may be.
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
