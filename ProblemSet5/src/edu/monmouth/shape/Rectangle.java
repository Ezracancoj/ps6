package edu.monmouth.shape ;

public class Rectangle implements Shape{
	private int length;
	private int width;
	
	public Rectangle(int length, int width) throws ShapeException{
		setWidth(width);
		setLength(length);
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) throws ShapeException{
		if(width < 0) {
			throw new ShapeException("Invalid number for width");
		}
		else {
			this.width = width;
		}
		
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) throws ShapeException{
		if(length < 0) {
			throw new ShapeException("Invalid number for lenght");
		}
		else {
			this.length = length;
		}
	}
	@Override
	public String toString() {
		return ("length: "+this.length + ", width: " + this.width);
		
		
	}
	
	public double area() {
		return length*width;
		
	}
}
