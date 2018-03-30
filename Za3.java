import java.util.Scanner;

public class Za3 {
	public static boolean Intersection(float ax1, float ay1, float ax2, float ay2, float bx1, float by1, float bx2, float by2) {
		float v1,v2,v3,v4;
		v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
		return (v1*v2<0) && (v3*v4<0);
	}
	public static void main(String[] args) {
		float x1,y1,x2,y2,x3,y3,x4,y4;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		x1 = s.nextFloat(); 
        y1 = s.nextFloat();
		x2 = s.nextFloat(); 
        y2 = s.nextFloat();
		x3 = s.nextFloat(); 
        y3 = s.nextFloat();
		x4 = s.nextFloat(); 
        y4 = s.nextFloat();
		boolean t = Intersection(x1,y1,x2,y2,x3,y3,x4,y4);
		if (t){
			System.out.println("Segments are intersected.");
		}
		else {
			System.out.println("There is no point of intersection.");
		}
    }
}