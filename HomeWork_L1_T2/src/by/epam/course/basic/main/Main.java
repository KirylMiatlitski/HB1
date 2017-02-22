package by.epam.course.basic.main;

import by.epam.course.basic.util.Functions;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		
		//Радиус 
		r=5.6;
		
		System.out.println("Площадь круга = "+Functions.CircleArea(r));
		System.out.println("Длина окружности с радиусом "+r+" = "+Functions.Circumference(r));
				
	}

}
