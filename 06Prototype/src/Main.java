
public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle1 = new Circle(3, 3, 2);
		Circle circle2 = circle1.copy();
		
		System.out.println(
				circle1.getX() + ", " +
				circle1.getY() + ", " + 
				circle1.getR());
		
		System.out.println(
				circle2.getX() + ", " +
				circle2.getY() + ", " + 
				circle2.getR());
		
	}
}
