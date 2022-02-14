package JoAirspaceAircraft.radar;

import JoAirspaceAircraft.geography.Coordinate;


//Basic aircraft implementation

public class Aircraft {

    private String callSign;
    private Coordinate coordinate;
    private int altitudeFL;

    public Aircraft(String callSign, Coordinate coordinate, int altitudeFl)
    {

        this.callSign = callSign;
        this.coordinate = coordinate;
        this.altitudeFL = altitudeFl;

    }

    public String getCallSign()
    {

        return callSign;

    }



    public Coordinate getCoordinate()
    {

        return coordinate;

    }


    public int getAltitudeFL()
    {

        return altitudeFL;

    }








}
