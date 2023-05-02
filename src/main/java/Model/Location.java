package Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {

    @Id
    private int id;

    private String stateName;
    private String weatherType;
    private int temperatureHigh;
    private int temperatureLow;


    public Location() {
    }

    public Location(String stateName, String weatherType, int temperatureHigh, int temperatureLow) {
        this.stateName = stateName;
        this.weatherType = weatherType;
        this.temperatureHigh = temperatureHigh;
        this.temperatureLow = temperatureLow;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public int getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(int temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public int getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(int temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", stateName='" + stateName + '\'' +
                ", weatherType='" + weatherType + '\'' +
                ", temperatureHigh=" + temperatureHigh +
                ", temperatureLow=" + temperatureLow +
                '}';
    }
}
