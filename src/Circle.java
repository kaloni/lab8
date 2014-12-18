public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		double pi = Math.PI;
		double area = pi*radius*radius;
		return area;
	}

}
