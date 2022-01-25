
public class CitylWeatherV1 {
	String[] months;
	double[] temperature;
	double[] precipitation;
	public String[] getMonths() {
		return months;
	}
	public void setMonths(String[] months) {
		this.months = months;
	}
	public double[] getTemperature() {
		return temperature;
	}
	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}
	public double[] getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(double[] precipitation) {
		this.precipitation = precipitation;
	}
	public CitylWeatherV1(String[] months, double[] temperature, double[] precipitation) {
		super();
		this.months = months;
		this.temperature = temperature;
		this.precipitation = precipitation;
	}
	
	public double averageAnnualTemperature() {
		double averageTemperature = 0.0;
		int noOfTemperatures = temperature.length;
		for(int index = 0; index < noOfTemperatures; index++) {
			averageTemperature = averageTemperature + temperature[index];
		}
		return (averageTemperature*1d)/noOfTemperatures;
	}
	
	public double totalAnnualPrecipitation() {
		double totalPrecipitation = 0.0;
		int noOfPrecipitation = precipitation.length;
		for(int index = 0; index < noOfPrecipitation; index++) {
			totalPrecipitation = totalPrecipitation + precipitation[index];
		}
		return totalPrecipitation;
	}
	
	public void convertToCelsius(String tempIndex) {
		if(tempIndex.equalsIgnoreCase("C")) {
			for(int index = 0; index < this.temperature.length; index++) {
				
				this.temperature[index] =  (this.temperature[index]-32)*5/9;
			}
		}
	}
	public void convertToCentimeter(String precipitationIndex) {
		if(precipitationIndex.equalsIgnoreCase("cm")) {
			for(int index = 0; index < this.precipitation.length; index++) {
				this.precipitation[index] = this.precipitation[index]*2.54;
			}
		}
	}
}
