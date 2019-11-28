package assignment3;

public class LineTest {
	public static void main(String[] args) {
		
		CartesianPoint cp1 = new CartesianPoint(2.0,5.0);
		CartesianPoint cp2 = new CartesianPoint(7.3, 10.1);
		LineSegment line1 = new LineSegment(cp1, cp2);
		
		CartesianPoint cp3 = new CartesianPoint(2.0, 5.0);
		CartesianPoint cp4 = new CartesianPoint(3.41421356237, 5.41421356237);
		LineSegment line2 = new LineSegment(cp3, cp4);
		
		CartesianPoint cp5 = new CartesianPoint(7.3, 10.1);
		CartesianPoint cp6 = new CartesianPoint(3.41421356237, 5.41421356237);
		LineSegment line3 = new LineSegment(cp5, cp6);
		
		CartesianPoint cp7 = new CartesianPoint(2.0, -1.0);
		CartesianPoint cp8 = new CartesianPoint(0.0, 0.0);
		LineSegment line4 = new LineSegment(cp7, cp8);
	
		CartesianPoint cp9 = new CartesianPoint(0.0, 0.0);
		CartesianPoint cp10 = new CartesianPoint(-2.0, 1.0);
		LineSegment line5 = new LineSegment(cp9, cp10);
		
		CartesianPoint cp11 = new CartesianPoint(-2.0, 1.0);
		CartesianPoint cp12 = new CartesianPoint(6.0, 5.0);
		LineSegment line6 = new LineSegment(cp11, cp12);
		
		CartesianPoint cp13 = new CartesianPoint(2.0, 5.0);
		CartesianPoint cp14 = new CartesianPoint(2.0, 4.0);
		LineSegment line7 = new LineSegment(cp13, cp14);
		
		if(line1.areRadiiOfSameCircle(line2)) {
			System.out.println("Line 1 and line 2 are radii of the same circle\n");
		}else {
			System.out.println("Line 1 and line 2 are NOT radii of the same circle\n");
		}
		
		if(line1.areRadiiOfSameCircle(line3)) {
			System.out.println("Line 1 and line 3 are radii of the same circle\n");
		}else {
			System.out.println("Line 1 and line 3 are NOT radii of the same circle\n");
		}
		
		if(line4.areRadiiOfSameCircle(line5)) {
			System.out.println("Line 4 and line 5 are radii of the same circle\n");
		}else {
			System.out.println("Line 4 and line 5 are NOT radii of the same circle\n");
		}
		
		if(line4.areRadiiOfSameCircle(line6)) {
			System.out.println("Line 4 and line 6 are radii of the same circle\n");
		}else {
			System.out.println("Line 4 and line 6 are NOT radii of the same circle\n");
		}
		
		if(line4.areRadiiOfSameCircle(line4)) {
			System.out.println("Line 4 and line 4 are radii of the same circle\n");
		}else {
			System.out.println("Line 4 and line 4 are NOT radii of the same circle\n");
		}
		
		System.out.println("Symmetric of line 1: "+line1.symmetric().toString());
		System.out.println("Symmetric of line 3: "+line3.symmetric().toString());
		System.out.println("Symmetric of line 4: "+line4.symmetric().toString());
		System.out.println("Symmetric of line 7: "+line7.symmetric().toString());

	}
}
