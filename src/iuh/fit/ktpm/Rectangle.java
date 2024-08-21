/*
 * @ (#) Rectangle.java 		1.0 	Aug 21, 2024
 *
 * Copyright (c) 2024 IUH. All right reserved	
 */

package iuh.fit.ktpm;

/*
 * @description
 * @author: Pham Thanh Huy
 * @version: 1.0
 * @create:	Aug 21, 2024
 */

public class Rectangle {
	private double length ; 
	private double width ;
	
	/*
	 * @description: Constructor
	 * 
	 * @param: double length, double width
	 */
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(double length, double width) {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("Length and width must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}

	/*
	 * @description: Get the length of the rectangle
	 * 
	 * @return: double
	 */
	public double getLength() {
        return this.length;
    }
	
	/*
	 * @description: Get the width of the rectangle
	 * 
	 * @return: double
	 */
	public double getWidth() {
		return this.width;
	}

	/*
	 * @description: Calculate the area of the rectangle
	 * 
	 * @return: double
	 */
	public double getArea() {
		return this.length * this.width;
	}
	
	/*
	 * @description: Calculate the perimeter of the rectangle
	 * 
	 * @return: double
	 */
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	/*
	 * @description: Set the width of the rectangle
	 * 
	 * @param: double width
	 */
	public void setWidth(double width) {
		if (width < 0) {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
		this.width = width;
	}
	
	/*
	 * @description: Set the length of the rectangle
	 * 
	 * @param: double height
	 * 
	 */
	public void setLength(double length) {
		if (length < 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}
		this.length = length;
	}
	
	@Override
	public String toString() {
	    return "Rectangle[length=" + length + ", width=" + width + 
	           ", perimeter=" + getPerimeter() + 
	           ", area=" + getArea() + "]"; 
	}

}
