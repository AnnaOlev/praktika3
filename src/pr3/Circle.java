package pr3;

class Circle extends Shape {

	protected double radius;
	
	public Circle() {
		this.color = "default";
		this.filled = false;
		this.radius = 1; 
	}
	
	public Circle (String color, boolean filled, double radius) {
		this.color = color;
		this.filled = filled;
		this.radius = radius;
	}
	
	public Circle (double radius) {
		this.color = "default";
		this.filled = false;
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return Math.pow(radius,2)*3.14;
	}

	@Override
	double getPerimeter() {
		return radius*2*3.14;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "Shape: circle " + this.color + " " + this.radius;
	}
}
