package com.example.CS310_WEATHERAPP.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    @Id
    private String id;
    private String name;
    @DBRef
    private List<WeatherInfo> weatherInfosList;

    public User() {
    }

    public User(String name, List<WeatherInfo> weatherInfoList) {
        this.name = name;
        this.weatherInfosList = weatherInfoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherInfo> getWeatherInfoList() {
        return weatherInfosList;
    }

    public void setWeatherInfoList(List<WeatherInfo> weatherInfoList) {
        this.weatherInfosList = weatherInfoList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weatherInfoList=" + weatherInfosList +
                '}';
    }
}
