package pkgShape;

public sealed class Ellipse extends Circle implements Area permits Ellipsoid {
	private double MinorRadius;

	public Ellipse(double MinorRadius, double Radius1) {
		super(Radius1);
		this.MinorRadius = MinorRadius;

		
	}
	
	public double getMinorRadius() {
		return MinorRadius;
	}

	public void setMinorRadius(double minorRadius) throws Exception {
		MinorRadius = minorRadius;
		if(MinorRadius<=0)
			throw new Exception("Radius is less than 0");
	}
	public boolean isCircle() {
		if (super.getRadius()==MinorRadius)
			return true; 
		else
			return false;
	}
	public double area() {
		
		double area = Math.PI * MinorRadius * super.getRadius();
		return area;
		
	}
	public int compareTo(Object s) {
		Ellipse ellipse = (Ellipse) s;
		return (int) (this.area()-ellipse.area());
		
	}
}
