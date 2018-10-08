package pr3;

public class Tester {
	public static void main (String[] args) {
		Circle s1 = new Circle("RED", false, 5.5); 
		System.out.println(s1);
		System.out.println(s1.getArea()); 
		System.out.println(s1.getPerimeter()); 
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius());
	
		Rectangle s3 = new Rectangle(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength());
	
		Square s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide());
	}
}
