// простые числа {2,3,5,7,11,...}
import java.util.Arrays;
import java.util.Scanner;
 
public class Z1 {
    public static void main(String[] args) {
		int N, i, j, b;
		double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        N = sc.nextInt();
        for (i = 2; i <= N; i++) {
			j=2;
			a = Math.sqrt(i);
			b = (int)(a);
			while (i % j != 0 && j <= b){
				j++;
			}
			if (j > b) {
				System.out.print(i + " ");
          	}
		}
	}
}
