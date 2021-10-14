package com.neosoft.sessiontasks;import java.util.*;
public class S1_palindromeNumber {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int digit=0,rev=0;
		int n=num;
		while(n >0)
		{
		digit = n%10;
        rev = (rev*10)+digit;
        n= n/10;
		}
		if(num==rev)
		{
		System.out.println("The entered number is a palindrome Number");
	    }
		else {
			System.out.println("The entered number is not a palindrome Number");
		}
	}
}
