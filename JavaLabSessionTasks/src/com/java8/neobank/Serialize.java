package com.java8.neobank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.java8.neobank.S20_BankApplicationConsole;

public class Serialize {
public Serialize(List<Object> ls1) {
	ObjectOutputStream oos = null;
	String outputFile = "resources/BankDetails.db";
	
	try {
		oos = new ObjectOutputStream(new FileOutputStream(outputFile));
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
		for(Object bank:ls1) {
			try {
				oos.writeObject(bank);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Serialization Done!");
		}
}
}
