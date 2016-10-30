package weather;

public class ConcreteObserver1 implements Observer, DisplayElement
{
	private Subject weatherData;
	private float temperature;
	private float humidity;
	private float atmosphere;
	private float windSpeed;
	
	public ConcreteObserver1(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.register(this);
	}
	
	public void display()
	{
		System.out.println("온도 : " + temperature + ", 습도 : " + humidity + ", 기압 : " + atmosphere + ", 풍속 : " + windSpeed);
	}

	public void update(float temperature, float humidity, float atmosphere, float windSpeed)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.atmosphere = atmosphere;
		this.windSpeed = windSpeed;
		display();
	}
}
