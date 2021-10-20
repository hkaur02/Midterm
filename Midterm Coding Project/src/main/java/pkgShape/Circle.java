package pkgShape;

public sealed class Circle extends Shape implements Area, Comparable<Object> permits Ellipse{

	private double Radius;
	
	public Circle(double r) {
		Radius = r;
	}
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double radius) throws Exception {
		this.Radius = radius;
		if(Radius<=0)
			throw new Exception("Radius is less than 0");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Circle circle = (Circle) o;
		return (int) (this.area()- circle.area());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		Radius = this.getRadius(); 
		double area = Math.PI * Math.pow(Radius, 2.0);		
		return area;

	}

}
