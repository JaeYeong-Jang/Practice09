package com.javaex.ex04;

public class RectTriangle extends Shape {

	// fields
	private double width;
	private double height;

	// constructors
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;

	}

	// method g/s

	// method
	@Override
	public double getArea() {
		double area = (this.width * this.height)/2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = this.width + this.height + Math.sqrt(this.width*this.width+this.height*this.height);
		return perimeter;
	}
}
