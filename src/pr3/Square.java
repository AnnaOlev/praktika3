package pr3;

class Square extends Rectangle {
	
	public double side; 
	
	Square() {
		this.color = "default";
		this.filled = false;
	}
	
	Square(double side){
		this.color = "default";
		this.filled = false;
		this.side = side;
	}
	
	Square (double side, String color, boolean filled){
		this.side = side;
		this.color = color;
		this.filled = filled;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public void setWidth(double side) {
		this.width = side;
	}
	
	@Override
	public void setLength(double side) {
		this.length = side;
	}
	
	@Override
	public String toString() {
		return "Shape: square " + this.side + " " + this.color;
	}
	

}
