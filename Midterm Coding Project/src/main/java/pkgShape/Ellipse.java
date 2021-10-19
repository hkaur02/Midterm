package pkgShape;

public sealed class Ellipse extends Circle permits Ellipsoid {
	private double MinorRadius;

	public Ellipse(double MinorRadius, double Radius) {
		super(Radius);
		
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}

	public void setMinorRadius(double minorRadius) {
		MinorRadius = minorRadius;
	}
	public boolean isCircle() {
		return false;
	}
	public double area(double Radius,double minorRadius) {
		double area = Math.PI * MinorRadius * Radius;
		return area;
		
	}
	public int compareTo(Object s) {
		Ellipse ellipse = (Ellipse) s;
		return (int) (this.area()-ellipse.area());
		
	}
}
