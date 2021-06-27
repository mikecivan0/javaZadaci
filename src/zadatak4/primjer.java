package zadatak4;

public class primjer {
public static void main(String[] args) {

	final double Width = 5.6;
	final double Height = 8.5;
	
	double area,perimeter;
	perimeter = 2*(Height+Width);
	area = Height*Width;
	
	System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", Height, Width, perimeter);
	System.out.printf("Area is %.1f * %.1f = %.2f \n", Width, Height, area);
}
}
