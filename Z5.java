import java.util.Scanner;

public class Z5 {

public static boolean isPalindrome(String text) {
    text = text.replaceAll("\\W","");
    StringBuilder strBuilder = new StringBuilder(text);
    strBuilder.reverse(); 
    String invertedText = strBuilder.toString();
    return text.equalsIgnoreCase(invertedText);
}

public static void main(String args[]){
    Scanner in = new Scanner(System.in);
	System.out.print("Sample input: ");
	String input = in.nextLine();
    System.out.print("Sample output: ");
	boolean s = isPalindrome(input);
    System.out.println(s);
}
}