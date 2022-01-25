import java.util.Scanner;

public class CityWeatherTesterV1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String city = "Apalachicola";
		String state = "FL";
		String tempLabel = "F";
		String precipLabel = "in";
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		double[] temperature = {52.7,55.3,60.7,66.8,74.1,80.0,81.9,81.7,79.1,70.2,62.0,55.2};
		double[] precipitation = {4.9,3.8,5.0,3.0,2.6,4.3,7.3,7.3,7.1,4.2,3.6,3.5};
		System.out.println("Enter the temperature index");
		tempLabel = in.nextLine();
		System.out.println("Enter the precipitation index");
		precipLabel = in.nextLine();
		CitylWeatherV1 cityWeather = new CitylWeatherV1(months, temperature, precipitation);
		cityWeather.convertToCelsius(tempLabel);
		cityWeather.convertToCentimeter(precipLabel);
		printResults(city, state, tempLabel, precipLabel, months, temperature, precipitation, cityWeather.averageAnnualTemperature(), cityWeather.totalAnnualPrecipitation());
		in.close();
	}
	public static void printResults(String city, String state, String tempLabel, String precipLabel, String[] months, double[] temperature, double[] precipitation, double avgTemp, double totalPrecip) {
		System.out.println();
		System.out.println("     Weather Data");
		System.out.println("     Location: " + city + ", " + state);
		System.out.format("Month     Temperature (" + tempLabel + ") Precipitation (" + precipLabel + ")");
		System.out.println();
		for(int index = 0; index < temperature.length; index++) {
			System.out.printf("%-15s %-15.2f %-15.2f \n",months[index], temperature[index], precipitation[index]);
		}
		
		System.out.println("\n*********************");
		System.out.format("Average Temperature: %-5.2f%s Total: %-5.2f%s",avgTemp, tempLabel, totalPrecip, precipLabel);
	}
}
