package com.javaintro;

public class Rectangle {
	public void calculateArea() {
		int width = 10;
		int length = 20;
		int area = width * length;
		System.out.println("Calculating area of rectangle is :" + area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle objRectangle = new Rectangle();
		objRectangle.calculateArea();

	}

}
