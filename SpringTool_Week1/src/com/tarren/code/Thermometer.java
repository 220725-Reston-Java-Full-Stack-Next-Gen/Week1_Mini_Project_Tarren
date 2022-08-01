package com.tarren.code;

import java.util.Arrays;

public class Thermometer {
	private int degreesF;
	private int degreesC;
	private String name;
	private int[] tempReadings; //hopefully specified as a length of 3
	
	public Thermometer() {//no args constructor
		
	}
	
	public Thermometer(int degreesF, int degreesC, String name, int[]tempReadings) {
		this.degreesF = degreesF;
		this.degreesC = degreesC;
		this.name = name;
		this.tempReadings = tempReadings;
	}

	public int getDegreesF() {
		return degreesF;
	}

	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTempReadings() {
		return tempReadings;
	}

	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}

	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}

	public static int convertToFahrenheit(int c) {
		return (int) (c*1.8 + 32);
	}
	public static int convertToCelsius(int f) {
		return (int) ((f-32) / 1.8);
	}
	public static void calculateAvgTemp(int[] temps) {
		System.out.println((temps[0] +temps[1] + temps[2])/3);// not sure if i need anything else here
	}
	
		
		
		
		

	

}
