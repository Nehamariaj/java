/**********************************************************************************
 * File:Palindrome.java
 * Description:To find whether a given word is palindrome or not
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:3/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a word to check whether it is palindrome or not :");
		String input=sc.next();
		boolean isPalin = isPalindrome(input);//function call
		
		if(isPalin){
			System.out.println("the given word is palindrome");
		}
		else {
			System.out.println("the word is not pallindrome");
		}
	}
	/*****************************************************************************************************
	 * to check whether the given word is palindrome or not we use a function called isPalindrome.In this
	 * function we convert string to character array and also calculate the length.
	 *****************************************************************************************************/
	static boolean isPalindrome(String input) {
		char a[]=input.toCharArray();
		int len=input.length();	
		for(int i=0;i<=len/2;i++){
			if(a[i]!=a[len-1-i])
			{
				return false;
			}
		}
		return true;
	
	}

}
