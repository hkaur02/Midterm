package pkgTestShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

public class SampleTest {

	
		public void Circletest() {
			Circle o = new Circle(10);
		double c1Area = o.area();
			assertEquals(314.15,c1Area, 0.01);
		}
}


