package com.neosoft.sessiontasks;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class S20_BankApplicationConsole {
	static Bank banks;
	static List<Object> ls1 = new ArrayList<>();

	public static void main(String[] args) {
		
		home();

	}

	static void home() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("BANK   OF  MYBANK");
		System.out.println("-----------------------------");

		System.out.println("1. Register Account");
		System.out.println("2. Login");
		System.out.println("3. Update accounts");
		System.out.println("4. Show Accounts");
		System.out.println("5. Exit");
		System.out.println();

		System.out.print("Enter Your Choice : ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			register();
			break;

		case 2:
			login();
			break;

		case 3:
			break;
		case 4:
			showAccounts();
			break;

		}

	}

	static void register() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Name");
		String name = sc.next();

		System.out.println("Enter Address");
		String address = sc.next();

		System.out.println("Enter Contact Number");
		String contactNo = sc.next();
		while (!contactNo.matches("[7-9][0-9]{9}")) {
			System.out.println("Invalid contact No!");
			System.out.println("Enter Contact Number");
			contactNo = sc.next();
		}

		System.out.println("Set User Name");
		String userName = sc.next();

		System.out.println("Set Password");
		String password = sc.next();
		while (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,30}$")) {
			System.out.println("Invalid Password");
			System.out.print("Enter Password again :");
			password = sc.next();
		}

		System.out.println("Enter Initial Deposit");
		Double deposit = sc.nextDouble();

		
		
		banks = new Bank(name, address, contactNo, userName, password, deposit);
		ls1.add(banks);
		
		System.out.println("Accountholder name :" + banks.getName());
		System.out.println("Accountholer address :" + banks.getAdd());
		System.out.println("Accountholdercontact :" + banks.getCno());
		home();

	}
	static void showAccounts() {
		if(ls1.isEmpty()) {
			System.out.println("No data found!");
		}
		else {
			for(Object elements : ls1) {
				System.out.println("Accounts Added : "+elements);
			}
		}
		home();
	}

	static void getDetails() {

	}

	static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username1 = sc.next();

		System.out.println("Enter Password");
		String password1 = sc.next();

		login1();

		while (username1.equals(banks.getUname()) && (password1.equals(banks.getPwd()))) {
			System.out.println("Login Successfuly");

			login1();
		}
	}

	static void login1() {
		System.out.println("Login Successfully");

		System.out.println("-----------------");
		System.out.println("WELCOME");
		System.out.println("-----------------");

		System.out.println("1. Deposit");
		System.out.println("2. Transfer");
		System.out.println("3. Last 5 Transactions");
		System.out.println("4. User Information");
		System.out.println("5. Log out");

		System.out.println("Enter a choice");
		Scanner sc = new Scanner(System.in);
		int choice1 = sc.nextInt();
		switch (choice1) {

		case 1:
			System.out.println("Enter Deposit Amount");
			Double dep = sc.nextDouble();
			System.out.println();
			banks.debit(dep);
			System.out.println("Amount Deposited Successfully");
			login1();
			break;

		case 2:

			System.out.println("Transfer Amount");

		case 3:
			System.out.println("Rs. " + banks.getDep() + " credited to your account.Balance Rs. " + banks.getDep()
					+ " as on" + new Date() + " at " + new Time(choice1));
			System.out.println(
					"Initial Deposit - Rs" + banks.getDep() + " as on " + new Date() + " at " + new Time(choice1));
			login1();
			break;

		case 4:
			System.out.println("Accountholder name :" + banks.getName());
			System.out.println("Accountholer address :" + banks.getAdd());
			System.out.println("Accountholdercontact :" + banks.getCno());

			login1();
			break;

		case 5:
			home();
			break;
		}

	}

}
