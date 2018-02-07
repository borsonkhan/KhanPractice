package khan.practice;

import java.util.ArrayList;

public class KhanPractice {
	
	public static void main(String[] args) {
		System.out.println("Q1 = "+ getText("khan"));
		System.out.println("Q2 = "+ getUpperText("khan"));
		System.out.println("Q3 = "+ getLowerText("BORSON"));
		System.out.println("Q4 = "+ getEvenText(20));
		System.out.println("Q5 = "+ getOddText(20));
		
	}
	/*
	 * Q4 = write a method that take one number input and return the list of all even number from o to that given number
	 * input = int number; 
	 * return type = ArrayList<Integer>; 
	 * serving bucket = list;
	 */
	public static ArrayList<Integer> getEvenText(int number){
		ArrayList<Integer> text = new ArrayList<Integer>();
		
		for(int i=0; i<=number;i++) {
			
			if(i%2==0) {
				
				text.add(i);
			}
		}
		return text;
	}
	/*
	 * Q5= write a method a number input and return the list of all odd number from 0 to that given number;
	 * input = int number; 
	 * return type = ArrayList<Integer>; 
	 * serving bucket =list;
	 */
	public static ArrayList<Integer> getOddText(int number){
		ArrayList<Integer> text = new ArrayList<Integer>();
		
		for(int i=0; i<number;i++) {
			
			if(i%2==1) {
				
				text.add(i);
			}
		}
		
		return text;
	}
	
	/**
	 *   Q3= write  a method that take one string input and return same string as a lower case;
	 *   input = String name;
	 *   return type = String; 
	 *   serving bucket = variable;
	 */
	public static String getLowerText(String name) {
		String text = " ";
		text = name.toLowerCase();
		return text;
	}

	
	/*
	 * Q2 = write  a method that take string input and return same as a upper case;
	 * input = String name; 
	 * return = String ; 
	 * serving bucket = variable;
	 */
	public static String getUpperText(String name) {
		String text = " ";
		
		text = name.toUpperCase();
		
		return text;
	}

	
    /*
     * Q1 = write a method that take one String input and return same as uppercase;
     * input = String name;
     * return type = String;
     * serving bucket = variable;
     */
	public static String getText (String name) {
		String text = " ";
		text = name.toUpperCase();
		return text;
	}
	
	

}
