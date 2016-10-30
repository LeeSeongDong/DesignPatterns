package weather;

import java.util.ArrayList;

public class WeatherData implements Subject 
{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float atmosphere;
	private float windSpeed;

	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}

	public void register(Observer o)
	{
		observers.add(o);
	}

	public void remove(Observer o) 
	{
		observers.remove(o);
	}

	public void notifyObserver() 
	{
		for (Observer o : observers)
		{
			o.update(temperature, humidity, atmosphere, windSpeed);
		}
	}

	public void setMeasurements(float temperature, float humidity, float atmosphere, float windSpeed)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.atmosphere = atmosphere;
		this.windSpeed = windSpeed;
		
		measurementsChanged();
	}
	
	public void measurementsChanged()
	{
		notifyObserver();
	}
}
