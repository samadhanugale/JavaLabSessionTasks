package com.neosoft.sessiontasks;

public class S13_Enum {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}
}

enum Level {
	LOW, MEDIUM, HIGH
}
