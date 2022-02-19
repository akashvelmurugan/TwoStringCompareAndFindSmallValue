package com.comparemethod;

import java.util.Scanner;

public class CompareTo {
	static String getSmalestString(String firstValue, String secondValue) {

		int firstStringCount=0;
		int secondStringCount=0;
		while (firstValue.length()>0) {
			if (firstValue.charAt(firstStringCount)==secondValue.charAt(secondStringCount)) {
				firstStringCount++;
				secondStringCount++;
				if (firstValue.length()==firstStringCount) {
					return firstValue;
				}
				break;
			}else {
				if (firstValue.charAt(firstStringCount)>secondValue.charAt(secondStringCount)) {
					return secondValue;
				}else if(firstValue.charAt(firstStringCount)<secondValue.charAt(secondStringCount)){
					return firstValue;
				}
			}
		}	
		return firstValue;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The First Value :");
		String firstValue = scanner.next();
		System.out.println("Enter The Second Value :");
		String SecondValue = scanner.next();
		String result= getSmalestString(firstValue,SecondValue);
		System.out.println("Small Value : "+result);	
	}


}
