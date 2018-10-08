package pr3;

class Rectangle extends Shape {
	
	protected double width;
	protected double length;
	
	Rectangle(){
		this.color = "default";
		this.filled = false;
	}
	
	Rectangle (double width, double length){
		this.width = width;
		this.length = length;
		this.color = "default";
		this.filled = false;
	}
	
	Rectangle (double width, double length, String color, boolean filled){
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth (double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength (double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public double getPerimeter() {
		return (width+length)*2;
	}
	
	@Override
	public String toString() {
		return "Shape: rectangle " + this.color + " " + this.width + " " + this.length;
	}
}
