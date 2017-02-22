package by.epam.course.basic.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2473;
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		
		/*System.out.println("Введите четырехзначное целое число:");
		if (sc.hasNextInt()) {
			num=sc.nextInt();
		}
		else{
			System.out.println("Вы ввели не целое число");
		}*/
		
		
		//Выделение цифр заданного числа
		int a1=num/1000;
		int a2=num/100%10;
		int a3=num/10%10;
		int a4=num%10;
		//Выводим результат
		System.out.println("Произведение цифр заданного четырехзначного числа = "+a1*a2*a3*a4);
		
	}

}
