package pkgShape;

public abstract sealed class Shape permits pkgShape.Circle {
	public Shape()
	protected abstract double area();
}

public sealed class Circle extends Shape permits pkgShape.Ellipse {
	private double Radius();
	public double area();
	protected double getRadius();
	protected double setRadius();
	public int compareTo(Object o){
		Collections.sort(Circle);
	}
	if(Radius<=0)
		throw new IllegalArgumentException("Radius is invalid.");
}

public class Ellipse extends Circle{
	private double MinorRadius();
	public Ellipse(double radi, double radi2) {
		double radi>0;
		double radi2>0;
	}
	public double getMinorRadius();
	public double setMinorRadius();
	public double area();
	public boolean isCircle();
	public int compareTo(object);
}

public final class Ellipsoid extends Ellipse