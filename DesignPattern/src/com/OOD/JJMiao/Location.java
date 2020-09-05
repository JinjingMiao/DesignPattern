package com.OOD.JJMiao;

public class Location {

    double lat, lon;
    public Location (double _lat, double _lon){
        lat = _lat;
        lon = _lon;
    }
    @Override
    public String toString(){
        return "lat"+ lat + "lon" + lon;

    }


}
