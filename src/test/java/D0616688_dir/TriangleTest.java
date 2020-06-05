import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest { 
	
	@Test
	public void testCheckTriangle3() {
		Triangle a = new Triangle();
		assertEquals("Triangle"   , a.CheckTriangle(2, 3, 4));
	}	

	@Test
	public void testCheckTriangle2() {
		Triangle a = new Triangle();
		assertEquals("Equilateral triangle"     , a.CheckTriangle(1, 1, 1));
	}	
		
	
	@Test
	public void testCheckTriangle5() {
		Triangle a = new Triangle();
		
		assertEquals("Isosceles triangle"   , a.CheckTriangle(1, 2, 2));
	}	
		
	@Test
	public void testCheckTriangle6() {
		Triangle a = new Triangle();
		assertEquals("Right triangle"   , a.CheckTriangle(3, 4, 5));
	}	

	@Test
	public void testCheckTriangle7() {
		Triangle a = new Triangle();
	
		assertEquals("Triangle"   , a.CheckTriangle(2, 3, 4));		
	} 
	
	@Test
	public void testCheckTriangle4() {
		Triangle a = new Triangle();
		
		assertEquals("Isosceles right triangle" , a.CheckTriangle(1, 1, 1.414));

	}

	@Test
	public void testCheckTriangle1() {
		Triangle a = new Triangle();
		assertEquals("not triangle"   , a.CheckTriangle(0, 0, 0));
		assertEquals("not triangle"   , a.CheckTriangle(-1, 2, 3));
		assertEquals("not triangle"   , a.CheckTriangle(2, -1, 5));		
	}
}