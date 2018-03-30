import java.util.Scanner;

public class Z5 {

public static boolean isPalindrome(String text) {
    text = text.replaceAll("\\W","");//удаляем все ненужное
    StringBuilder strBuilder = new StringBuilder(text);
    strBuilder.reverse(); //переворачиваем строку
    String invertedText = strBuilder.toString();//присваиваем перевернутую строку
    return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

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