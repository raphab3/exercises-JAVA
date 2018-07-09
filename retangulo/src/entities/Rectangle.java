package entities;

public class Rectangle {
	public double width;
	public double height;
	double diagonal;
	
	public double area() {
		return width * height;
	}
	public double perimetro() {
		return 2*(width + height);
	}
	public double diagonal() {
		return  this.diagonal =  Math.sqrt((width * width) + (height * height));			
	}
	@Override
	public String toString() {
		return "Area: " + String.format("%.2f%n", area())  +
			   "Perimeter: " + String.format("%.2f%n", perimetro()) +
			   "Diagonal: " +  String.format("%.2f%n", diagonal());
	}
//	tring.format("$ %.2f", netSalary())
}
