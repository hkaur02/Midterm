package pkgShape;

public abstract sealed class Shape permits Circle{
	protected abstract double area();
	public Shape() {}
}
