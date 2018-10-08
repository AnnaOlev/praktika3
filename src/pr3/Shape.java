package pr3;

public abstract class Shape {
	
	protected String color;
	protected boolean filled;
	
	public Shape() {
		this.color = "default";
		this.filled = false;
	}
	
	public Shape (String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor(String a) {
		this.color = a;
	}
	
	public void setFilled(boolean b) {
		this.filled = b;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public String toString() {
		return this.color + " " + this.filled;
	}
	abstract double getArea();
	
	abstract double getPerimeter();
}
