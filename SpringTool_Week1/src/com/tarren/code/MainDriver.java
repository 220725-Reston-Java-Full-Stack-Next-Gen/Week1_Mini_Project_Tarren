package com.tarren.code;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name your thermometer");
		String nameString = scanner.nextLine();
		
		System.out.println("Hi User, thanks for using "  + "today!" );
		
		System.out.println("enter a temperature in Fahrenheit");
		int userTempF = scanner.nextInt();
		System.out.println("enter a temperature in Celsius");
		int userTempC = scanner.nextInt();
		
		Thermometer thermometer = new Thermometer();
		thermometer.setDegreesF(userTempF);
		thermometer.setDegreesC(userTempC);
		
		System.out.println("your Fahrenheit temp in Celsius is" + Thermometer.convertToCelsius(userTempF));
		System.out.println("your Celsius temp in Fahrenheit is" + Thermometer.convertToFahrenheit(userTempC));
		
		System.out.println("please enter 3 recent temperature readings");
		int temps[] = new int[3];
		temps[0] = scanner.nextInt();
		temps[1] = scanner.nextInt();
		temps[2] = scanner.nextInt();
		
		Thermometer.calculateAvgTemp(temps);
		
		System.out.println("thanks for using, Goodbye!");
		
		
		
		

	}

}
