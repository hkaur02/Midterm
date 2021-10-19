package pkgShape;

public final class Ellipsoid extends Ellipse{
	private double HeightRadius;
	public Ellipsoid(double MinorRadius, double MajorRadius, double radi) {
		super(MinorRadius, MajorRadius);
		// TODO Auto-generated constructor stub	
	}
	public double volume() {
		double MinorRadius = 0;
		double Radius = 0;
		double radi = 0;
		double volume = Math.PI * MinorRadius * Radius * radi * (4/3);
		return volume;
	}
	public int compareTo(Object e) {
		Ellipsoid ellipsoid = (Ellipsoid) e;
		return (int) (this.area()-ellipsoid.area());
	}
}
