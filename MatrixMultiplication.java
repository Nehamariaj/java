/**********************************************************************************
 * File:MatrixMultiplication.java
 * Description:To do matrix multiplication.
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:10/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the first matrix:");
		int row1=sc.nextInt();
		int column1=sc.nextInt();
		System.out.println("enter the order of the second matrix:");
		int row2=sc.nextInt();
		int column2=sc.nextInt();
		int[][]matrix1=new int[row1][column1];
		int [][]matrix2=new int[row2][column2];
		int[][]resultant=new int[row1][column2];
		
		if(column1!=row2) {
			System.out.println("matrix multiplication not possible");
		}
		else
		{
			System.out.println("enter the values of first matrix:");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter the values of second matrix:");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<column2;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			System.out.println("first matrix:");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print(matrix1[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("second matrix:");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<column2;j++)
				{
					System.out.print(matrix2[i][j]+"\t");
				}
				System.out.println();
			}
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column2;j++)
				{
					resultant[i][j]=0;
					for(int k=0;k<row2;k++) {
						resultant[i][j]=resultant[i][j]+(matrix1[i][k]*matrix2[k][j]);
				}
				}	
			}
			System.out.println("resultant matrix:");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column2;j++)
				{
			System.out.print(resultant[i][j]+"\t");
				}
			System.out.println();
			}
		}

	}
}


