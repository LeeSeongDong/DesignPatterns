package weather;

public class ConcreteObserver2 implements Observer, DisplayElement
{
	private Subject weatherData;
	private float max;
	private float min;
	private float sum;
	private int cnt;
	
	public ConcreteObserver2(Subject weatherData)
	{
		max = -2123456789;
		min = 2123456789;
		sum = 0;
		cnt = 0;
		this.weatherData = weatherData;
		weatherData.register(this);
	}
	
	public void display()
	{
		System.out.println("최고기온 : " + max + ", 최저기온 : " + min + ", 평균기온 : " + sum/cnt);
	}

	public void update(float temperature, float humidity, float atmosphere, float windSpeed)
	{
		if(max < temperature)
		{
			max = temperature;
		}
		
		if(min > temperature)
		{
			min = temperature;
		}
		
		sum += temperature;
		++cnt;
		
		display();
	}
}
