package Model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weatherinfo {

	@Id
	private String id;
	
	private LocalDateTime time;
	Location loc;
	Weather weather;
	
	public Weatherinfo() {
		// TODO Auto-generated constructor stub
	}

	public Weatherinfo(LocalDateTime time, Location loc, Weather weather) {
		super();
		this.time = time;
		this.loc = loc;
		this.weather = weather;
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

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "Weatherinfo [time=" + time + ", loc=" + loc + ", weather=" + weather + "]";
	}
	
	
	
	
	
	
	
}
