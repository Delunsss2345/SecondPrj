/*
 * @ (#) TestRectangle.java 		1.0 	Aug 21, 2024
 *
 * Copyright (c) 2024 IUH. All right reserved	
 */

package iuh.fit.ktpm;

import java.util.Scanner;

/*
 * @description
 * @author: Pham Thanh Huy
 * @version: 1.0
 * @create:	Aug 21, 2024
 */

public class TestRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Length: ");
		double length = sc.nextDouble();
		
		System.out.print("Width: ");
		double width = sc.nextDouble();
		
		rectangle.setLength(length);
		rectangle.setWidth(width);
		
		System.out.println("Perimeter: " + rectangle.getPerimeter());
		System.out.println("Area: " + rectangle.getArea());
		System.out.println(rectangle.toString());
		
		sc.close(); 
	}
}
