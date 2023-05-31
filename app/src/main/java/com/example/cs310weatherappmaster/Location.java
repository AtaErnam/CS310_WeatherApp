package com.example.cs310weatherappmaster;


public class Location {


    private String id;


    private double longtitude;
    private double latitude;
    private String stateName;
    private String province;


    public Location() {
    }

    public Location(double longtitude, double latitude, String stateName, String province) {
        super();
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.stateName = stateName;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Location [longtitude=" + longtitude + ", latitude=" + latitude + ", stateName=" + stateName
                + ", province=" + province + "]";
    }




}
