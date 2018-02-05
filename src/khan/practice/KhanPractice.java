package khan.practice;

public class KhanPractice {
	
	public static void main(String[] args) {
		System.out.println("Q1 = "+ getText("khan"));
		System.out.println("Q2 = "+ getUpperText("khan"));
		System.out.println("Q3 = "+ getLowerText("BORSON"));
		
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
