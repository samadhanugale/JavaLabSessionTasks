package com.neosoft.sessiontasks;
import java.util.*;
public class S1_pattern {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		int c=1;
		for (int i=1;i<=row;i++)
		{
			for(int k=row-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+c);
				c++;
			}
			
			System.out.println(" ");
		}

	}

}
