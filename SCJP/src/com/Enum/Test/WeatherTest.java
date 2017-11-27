package com.Enum.Test;

public class WeatherTest {

	static Weather w;

	public static void main(String[] args) {

		/*System.out.println(w.RAINY.count + " " + w.SUNNY.count + " "
				+ w.COLD.count);*/

		System.out.println(Weather.RAINY.count + " " + Weather.SUNNY.count + " "
				+ Weather.COLD.count);
	}
}

enum Weather {
	RAINY, SUNNY, COLD;
	int count = 0;

	Weather() {
		System.out.println("c");
		count++;
	}

}