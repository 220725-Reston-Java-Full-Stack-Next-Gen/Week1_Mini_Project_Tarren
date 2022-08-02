package com.tarren.code;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name your thermometer");
		String name = scanner.nextLine();
		
		Thermometer obj = new Thermometer(0, 0, name, null);
		obj.setName(name);
		
		System.out.println("Hi User, thanks for using " + obj.getName() + " today!" );
		
		System.out.println("enter a temperature in Fahrenheit");
		int fahrenheit = scanner.nextInt();
		
		System.out.println("enter a temperature in Celsius");
		int celsius = scanner.nextInt();
		
		int resultF = obj.convertToFahrenheit(celsius);
		int resultC = obj.convertToCelsius(fahrenheit);
		
		System.out.println("The temperature in " + fahrenheit + " degrees Fehrenheit is " + resultC + " degrees celsius");
		System.out.println("The temperature in " + celsius + " degrees Celsius is " + resultF + " degrees Fahrenheit");
		
		
		
		System.out.println("please enter 3 recent temperature readings");
		int temp1 = scanner.nextInt();
		int temp2 = scanner.nextInt();
		int temp3 = scanner.nextInt();
		
		int[] temps = {temp1, temp2, temp3};
		
		obj.setTempReadings(temps);
		
		obj.calculateAvgTemp(obj.getTempReadings());
		
		//int temps[] = new int[3];
		//temps[0] = scanner.nextInt();
		//temps[1] = scanner.nextInt();
		//temps[2] = scanner.nextInt();
		
		//Thermometer.calculateAvgTemp(temps);
		
		System.out.println("thanks for using, Goodbye!");
		
		
		
		

	}

}
