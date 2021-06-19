package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {

		List<Shape> sList = new ArrayList<Shape>();

		Rectangle r01 = new Rectangle(5, 6);
		
		RectTriangle rt01 = new RectTriangle(6, 2);

		sList.add(r01);
		sList.add(rt01);
		
		for (Shape shape : sList) {
			System.out.println("area : " + shape.getArea());
			System.out.println("Perimeter : " + shape.getPerimeter());
			
			if (shape instanceof Resizeable) {
				((Resizeable) shape).resize(0.5);
				System.out.println("new area : " + shape.getArea());
				System.out.println("new Perimeter : " + shape.getPerimeter());
			}

		}

	}
}
