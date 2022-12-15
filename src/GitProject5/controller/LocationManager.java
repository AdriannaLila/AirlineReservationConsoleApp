package GitProject5.controller;

import GitProject5.model.ticket.Location;

public class LocationManager {

    public static Location getLocation(String givenLocation){
        for(Location location : Location.values()){
            if(location.name().equals(givenLocation)){
                return location;
            }
        }
        System.err.println("No location found");
        return null;
    }
}
