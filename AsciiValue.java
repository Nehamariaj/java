package javalab;
import java.util.Scanner;
public class AsciiValue {
	public static void main(String[] String) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1:");
		int num1=sc.nextInt();
		System.out.println("enter number2:");
		int num2=sc.nextInt();
		System.out.println("enter number3:");
		int num3=sc.nextInt();
	    int number=small(num1,num2,num3);
	    System.out.println("smallest number="+number);
	}
   public static int small(int num1,int num2,int num3)
   {
	   if(num1<num2&&num1<num3) {
		  return num1;
	   }
	   else if(num2<num3) {
		   return num2;
	   }
	   else
	   {
		   return num3;
	   }
   }
}
