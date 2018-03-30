import java.util.Scanner;
 
public class Z4z {
    public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a and b: ");
		a = s.nextInt(); 
        b = s.nextInt();
        System.out.println("NOD: "+ NOD(a,b));
		System.out.println("NOK: "+ NOK(a,b));
    }
    
    public static int NOD(int x, int y) {
        if (y == 0) return x;
        int c = x % y;
        return NOD(y, c);
    }
	public static int NOK(int x, int y) {
		int d = x * y / NOD(x, y);
		return d;
	}
}