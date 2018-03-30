// числа Фибоначчи {0,1,1,2,3,5,8,13,...}
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
public class Z2z {
	private static ArrayList<Integer> f = new ArrayList<Integer>();
    private static int count = 0;
    public static long Fib(int i){
	if(i < f.size())return f.get(i);
        if(i==0){ 
		f.add(0); return 0; 
		}
        if(i==1){ 
		f.add(1); 
		return 1; 
		}
        long v = Fib(i-2) + Fib(i-1);
        f.add((int)v);
        return v;
    }
 public static void main(String[]args){
	int N, i;
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter N: ");
    N = sc.nextInt();
	for(i=0; i<N; i++){
		 if (Fib(i)<N) {
			System.out.println(i+" "+Fib(i));
		 }
		 else
		 {
			 System.exit(0);;
		 }
    }
 }
}
