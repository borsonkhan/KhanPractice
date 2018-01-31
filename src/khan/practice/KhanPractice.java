package khan.practice;

public class KhanPractice {
	
	public static void main(String[] args) {
		System.out.println("Q1 = "+ getText("khan"));
		
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
