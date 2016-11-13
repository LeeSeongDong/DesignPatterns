package weather;

public interface Observer 
{
	void update(float temperature, float humidity, float atmosphere, float windSpeed);
}
