/**********************************************************************************
 * File:EmployeeDetails.java
 * Description:To print the details of employee using the concept of Inheritance.
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:17/10/23
 **********************************************************************************/
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String[] args) {
		Officer officer=new Officer();
		Manager manager=new Manager();
		officer.getdetails();
		officer.getspecialization();
		System.out.println();
	    System.out.println("Details of the officer:");
	    officer.printdetails();
		officer.printSalary();
		officer.printspecialization();
		//manager
		System.out.println();
		manager.getdetails();
		manager.getdepartment();
		System.out.println();
		System.out.println("Details of the manager:");
		manager.printdetails();
		manager.printSalary();
	    manager.printdepartment();
		}
	}
class Employee{
   Scanner sc=new Scanner(System.in);
   int salary,age;
   String name,address;
   long phone;
	public void getdetails() {
		System.out.println("Enter the following details:");
		System.out.print("Name:");
		name =sc.nextLine();
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Phone number:");
		phone=sc.nextLong();
		System.out.print("Salary:");
		salary=sc.nextInt();
		sc.nextLine();
		System.out.print("Address:");
	    address=sc.nextLine();	
	}
	public void printSalary() {
		System.out.print("Salary:"+salary);
		}
	public void printdetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone number:"+phone);
		System.out.println("Address:"+address);
	}
}
class Officer extends Employee{
	String specialize;
	public void getspecialization() {
		System.out.print("Enter your specialisation:");
		specialize=sc.nextLine();
	}
	public void printspecialization() {
		System.out.println("Specialisation:"+specialize);
		}
}
class Manager extends Employee{
	String department;
	public void getdepartment() {
		System.out.print("Enter your department:");
		department=sc.nextLine();
	}
	public void printdepartment() {
		System.out.println("Department:"+department);
	}
}
