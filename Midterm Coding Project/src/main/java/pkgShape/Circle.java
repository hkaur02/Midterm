package pkgShape;

public sealed class Circle extends Shape implements Area, Comparable<Object> permits Ellipse{

	private double Radius;
	
	public Circle(double r) {
		Radius = r;
		if(Radius<=0)
			throw new IllegalArgumentException("Radius is less than 0");
	}
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double radius) throws Exception {
		this.Radius = radius;
		if(Radius<=0)
			throw new IllegalArgumentException("Radius is less than 0");
	}

	@Override
	public int compareTo(Object o) {
		Circle circle = (Circle) o;
		return (int) (this.area()- circle.area());
	}

	@Override
	public double area() {
		Radius = this.getRadius(); 
		double area = Math.PI * Math.pow(Radius, 2.0);		
		return area;

	}

}
