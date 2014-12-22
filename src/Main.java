public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(2);
		Square square = new Square(2);
		Triangle triangle = new Triangle(2,2);
		
		System.out.println(circle.getArea());
		System.out.println(square.getArea());
		System.out.println(triangle.getArea());

	}

}
