Part 2: Checking if the Triangle is an Isosceles Triangle or Scalene or Equilateral Triangle
//
Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is equilateral only if X = Y = Z.
//Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal. If X, Y, Z are three sides of the triangle. Then, the triangle is isosceles if either X = Y or X = Z or Y = Z.
//A scalene triangle: A scalene triangle is a triangle that has no equal sides. None of its three sides are equal to each other and it has no equal angles either. Then, the triangle is isosceles if either X = Y and X = Z and Y = Z.
//
Using example of the following input values;
Input: X = 6, Y = 8, Z = 10
Output: Scalene Triangle
Explanation: Since all the sides of the given triangle are unequal, the triangle is scalene.
Input: X = 10, Y = 10, Z = 10
Output: Equilateral Triangle
Explanation: Since all the sides of the given triangle are equal.
// Given sides of triangle
	int x = 8, y = 7, z = 9;
	
	// Function call
	checkTriangle(x, y, z);
	

import java.util.Scanner;
public class Lab_02_2_Kiyini_Joseph_Balamazze {

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
