public class Triangle extends Shape {
	
	private double height;
    private double base;
	
	public Triangle(double height,double base){
		this.height = height;
        this.base = base
	}
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
	@Override
	public double getArea() {
    return (base/2.0) * height/2.0;
    }

}
