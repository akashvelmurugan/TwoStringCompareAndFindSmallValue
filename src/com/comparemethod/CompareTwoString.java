package com.comparemethod;

import java.util.Scanner;

public class CompareTwoString {
	static String getSmalestString(String firstString, String secondString) {
		if (firstString.length()>secondString.length()) {
			return secondString;		
		}else if (firstString.length()<secondString.length()) {
			return firstString;
		}else if (firstString.length()==secondString.length()) {
			int firstStringCount=0;
			int secondStringCount=0;
			while (firstString.length()>0) {
				if (firstString.charAt(firstStringCount)==secondString.charAt(secondStringCount)) {
					firstStringCount++;
					secondStringCount++;
				}else {
					if (firstString.charAt(firstStringCount)>secondString.charAt(secondStringCount)) {
						return secondString;
					}else if(firstString.charAt(firstStringCount)<secondString.charAt(secondStringCount)){
						return firstString;
					}
				}
			}
		}
		return firstString;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String Value :");
		String firstString = scanner.next();
		System.out.println("Enter The Second VAlue :");
		String secondString = scanner.next();
		String result= getSmalestString(firstString,secondString);
		System.out.println(result);	
	}

}
