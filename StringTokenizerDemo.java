package javaLab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a set of numbers:");
		String data=sc.nextLine();
		int sum=0;
		StringTokenizer obj=new StringTokenizer(data);
		while(obj.hasMoreTokens()) {
			int num=Integer.parseInt(obj.nextToken());
			System.out.println("next token:"+num);
			sum=sum+num;
		}
		System.out.println("Sum of integers:"+sum);
	}
}
