package pkgTestShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipse;
import pkgShape.Ellipsoid;

public class SampleTest {

	@Test
		public void Circletest() {
			Circle o = new Circle(10);
		double c1Area = o.area();
			assertEquals(314.15,c1Area, 0.01);
		}
	
	@Test
		public void EllipseTest() {
			Ellipse s = new Ellipse(10,20);
			double e1Area = s.area();
			assertEquals(628.32,e1Area, 0.01);
	}
	
	@Test
	public void EllipsoidTest() throws Exception {
		Ellipsoid a = new Ellipsoid(10,20,25);
		double e2Volume = a.volume();
		assertEquals(20943.95,e2Volume, 0.01);
}
}


