package pkgShape;

public sealed class Circle extends Shape permits Ellipse{
	private double Radius;
	public Circle(double radius2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		Radius = this.getRadius(); 
		double area = Math.PI * Math.pow(Radius, 2.0);		
		return area;
	}
	protected double getRadius() {
		return Radius;
	}
	protected void setRadius(double radius) {
		this.Radius = radius;
	}
	public int compareTo(Object o) {
		Circle circle = (Circle) o;
		return (int) (this.area()- circle.area());
	}
}
