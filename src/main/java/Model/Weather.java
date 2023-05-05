package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weather {
	
	@Id
	private String id;
	
	private String weatherEvent;
	private float tempHigh;
	private float tempLow;
	private float windSpeed;
	private float humidity;
	private float uv;
	private float airQuality;
	
	
	public Weather() {
		// TODO Auto-generated constructor stub
	}


	public Weather(String weatherEvent, float tempHigh, float tempLow, float windSpeed, float humidity, float uv,
			float airQuality) {
		super();
		this.weatherEvent = weatherEvent;
		this.tempHigh = tempHigh;
		this.tempLow = tempLow;
		this.windSpeed = windSpeed;
		this.humidity = humidity;
		this.uv = uv;
		this.airQuality = airQuality;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getWeatherEvent() {
		return weatherEvent;
	}


	public void setWeatherEvent(String weatherEvent) {
		this.weatherEvent = weatherEvent;
	}


	public float getTempHigh() {
		return tempHigh;
	}


	public void setTempHigh(float tempHigh) {
		this.tempHigh = tempHigh;
	}


	public float getTempLow() {
		return tempLow;
	}


	public void setTempLow(float tempLow) {
		this.tempLow = tempLow;
	}


	public float getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}


	public float getHumidity() {
		return humidity;
	}


	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}


	public float getUv() {
		return uv;
	}


	public void setUv(float uv) {
		this.uv = uv;
	}


	public float getAirQuality() {
		return airQuality;
	}


	public void setAirQuality(float airQuality) {
		this.airQuality = airQuality;
	}


	@Override
	public String toString() {
		return "Weather [weatherEvent=" + weatherEvent + ", tempHigh=" + tempHigh + ", tempLow=" + tempLow
				+ ", windSpeed=" + windSpeed + ", humidity=" + humidity + ", uv=" + uv + ", airQuality=" + airQuality
				+ "]";
	}
	
	
	
	
	
	
	
}
