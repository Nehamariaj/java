/**********************************************************************************
 * File:Frequency.java
 * Description:To check the frequency of a letter in a given sentence.
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:3/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a sentence:");
		String input=sc.nextLine();
		System.out.println("enter a letter:");
		char letter=sc.next().charAt(0);
		int sent=checkfrequency(input,letter);
		if(sent>0) {
			System.out.println("frequency="+sent);
		}
		else {
			System.out.println("the letter is not present");
		}
}
	static char checkfrequency(String input,char letter) {
		Scanner sc= new Scanner(System.in);
		char count=0;
		char a[]=input.toCharArray();
		int len=input.length();	
		
		for(int i=0;i<len;i++){
			if(letter==a[i]) {
				count++;
			}
		}
		return count;
	}
}
