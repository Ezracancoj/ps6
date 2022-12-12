package edu.monmouth.problemSet5;

import edu.monmouth.shape.*;

public class ProblemSet5 {

	public static void main(String[] args) {
		// validate invalid values are set to zero
		try {Rectangle invalidRectangle = new Rectangle(-9, -8);
		System.out.println("invalidRectangle length: " + invalidRectangle.getLength() + 
				" width: " + invalidRectangle.getWidth());
		}
		catch(ShapeException e)
		{ System.out.println("recived ShapeException"+e);}
		
		try {
		Circle invalidCircle = new Circle(-7);
		System.out.println("invalidCircle radius: " + invalidCircle.getRadius());
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);}
		
		
		// create valid Rectangles and Circles
		Rectangle smallRectangle = null;
		try {
			smallRectangle = new Rectangle(3, 4);
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);
		}
		
		Rectangle largeRectangle = null;
		try { largeRectangle = new Rectangle(300, 400);
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);
		}
		
		Circle smallCircle = null;
		try { smallCircle = new Circle(5);
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);
		}
		
		
		Circle largeCircle = null;
		try { largeCircle = new Circle(50);
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);
		}
		
		// declare a reference to a Shape that refers to a concrete class
		Shape rectangle = null;
		try {rectangle = new Rectangle(8, 12);
		}catch(ShapeException e) {
			System.out.println("recived ShapeException"+e);
		}
		Shape circle = null;
		try { circle = new Circle(10);
		}catch(ShapeException e) {
			System.out.println("recived ShapeExceptio"+e);
		}
		
		
		// invoke the toString() method
		System.out.println(smallRectangle);
		System.out.println(largeRectangle);
		System.out.println(smallCircle);
		System.out.println(largeCircle);
		System.out.println(rectangle);
		System.out.println(circle);
		
		// pass Rectangle & Circle references to printArea()
		printArea(smallRectangle);
		printArea(largeRectangle);
		printArea(smallCircle);
		printArea(largeCircle);
		printArea(rectangle);
		printArea(circle);
	}
	
	static void printArea(Shape shape) {
		System.out.println("arae: "+shape.area());
	}

}
