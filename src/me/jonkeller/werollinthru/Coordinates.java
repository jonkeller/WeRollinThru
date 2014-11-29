package me.jonkeller.werollinthru;

public class Coordinates {
    private double lat, lon;

    public Coordinates(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    
    public double latitude() {
        return lat;
    }

    public double longitude() {
        return lon;
    }
    
    public double squareOfDistance(Coordinates other) {
        return (other.lat-lat)*(other.lat-lat) + (other.lon-lon)*(other.lon-lon);
    }
}
