import java.util.Scanner;
 
public class Z6z {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter Text: ");
	String s = in.nextLine(); 
    String result = s.replaceAll("[0-9]+", "");
	System.out.print("New Text: ");
    System.out.println(result);
    }
}