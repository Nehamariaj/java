/**********************************************************************************************************
 * File:Abstractclass.java
 * Description:To print the details of number of sides using the concept of abstract class and Inheritance.
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:27/10/23
 ********************************************************************************************************/
package javaLab;

public class AbstractClass {
public static void main(String[] args) {
	Rectangle rectangle=new Rectangle();
	Triangle triangle=new Triangle();
	Hexagon hexagon=new Hexagon();
	rectangle.numberOfSides();
	triangle.numberOfSides();
	hexagon.numberOfSides();
}
}
abstract class SHAPE{
	abstract void numberOfSides();
}
class Rectangle extends SHAPE {
	public void numberOfSides(){
		System.out.println("Rectangle has 4 sides");
	}
}
class Triangle extends SHAPE {
	public void numberOfSides(){
		System.out.println("Triangle has 3 sides");
		}
}
class Hexagon extends SHAPE{
	public void numberOfSides(){
		System.out.println("Hexagon has 6 sides");
	}
}
