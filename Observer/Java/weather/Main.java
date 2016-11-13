package weather;

public class Main 
{
	public static void main(String[] args)
	{
		// subject 생성
		WeatherData weatherData = new WeatherData(); 

		// Observers 생성
		ConcreteObserver1 co1 = new ConcreteObserver1(weatherData);
		ConcreteObserver2 co2 = new ConcreteObserver2(weatherData);

		// 기상대 시뮬레이션
		weatherData.setMeasurements(80, 65, 30.4f, 20); 
		weatherData.setMeasurements(82, 70, 29.2f, 14);
		weatherData.setMeasurements(78, 90, 29.2f, 21);
	}
}
