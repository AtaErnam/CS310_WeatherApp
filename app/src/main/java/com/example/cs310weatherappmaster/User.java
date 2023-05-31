package com.example.cs310weatherappmaster;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String id;
    private String name;

    private List<WeatherInfo> weatherInfosList;

    public User() {
    }

    public User(String id, String name, List<WeatherInfo> weatherInfoList) {
        this.id = id;
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

    public List<User> getUsers() {
        List<User> return_list = new ArrayList<>();

        List<WeatherInfo> tmpList = new ArrayList<WeatherInfo>();

        return_list.add(new User("1","Alper",tmpList));
        return_list.add(new User("2","Tuna",tmpList));
        return_list.add(new User("3","Memo",tmpList));
        return_list.add(new User("4","AMG",tmpList));
        return_list.add(new User("5","Devrim",tmpList));
        return_list.add(new User("6","Erol",tmpList));
        return return_list;
    }



}
