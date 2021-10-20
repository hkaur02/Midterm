package pkgShape;

public final class Ellipsoid extends Ellipse implements Volume{
	private double HeightRadius;
	public Ellipsoid(double MinorRadius, double Radius, double radi) throws Exception {
		super(MinorRadius, Radius);
		if(radi<=0)
			throw new Exception("Radius is less than 0");
	}
	public double volume() {
		double volume = Math.PI * super.getMinorRadius() * super.getRadius() * HeightRadius * (4/3);
		return volume;
	}
	public int compareTo(Object e) {
		Ellipsoid ellipsoid = (Ellipsoid) e;
		return (int) (this.area()-ellipsoid.area());
	}
}
