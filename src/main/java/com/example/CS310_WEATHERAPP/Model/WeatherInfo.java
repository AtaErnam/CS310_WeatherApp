package com.example.CS310_WEATHERAPP.Model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WeatherInfo {

	@Id
	private String id;
	
	private LocalDateTime time;
	private String locId;
	private String weatherId;
	
	public WeatherInfo() {
		// TODO Auto-generated constructor stub
	}

	public WeatherInfo(LocalDateTime time, String locId, String weatherId) {
		super();
		this.time = time;
		this.locId = locId;
		this.weatherId = weatherId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getWeatherId() {
		return weatherId;
	}

	public void setWeatherId(String weatherId) {
		this.weatherId = weatherId;
	}

	@Override
	public String toString() {
		return "WeatherInfo [time=" + time + ", locId=" + locId + ", weatherId=" + weatherId + "]";
	}
	
	
	
	
	
	
	
}
