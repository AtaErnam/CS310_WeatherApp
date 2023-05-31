package com.example.cs310weatherappmaster;


import java.time.LocalDateTime;

public class WeatherInfo {


    private String id;

    private LocalDateTime time;
    private String locId;
    private String weatherId;


    public WeatherInfo() {
        // TODO Auto-generated constructor stub
    }

    public WeatherInfo(String id, LocalDateTime time, String locId, String weatherId) {
        super();
        this.id = id;
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
