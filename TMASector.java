package JoAirspaceAircraft.airspace;

import JoAirspaceAircraft.geography.Circle;
import JoAirspaceAircraft.geography.Coordinate;
import static JoAirspaceAircraft.geography.DistanceCalculator.*;



/*
Terminal Maneuvering Area

An elliptical/circular sector used near airports for landing / departures
We are using circle for simplicity

 */

public class TMASector implements AirSector{

    private Circle shape;
    private int upperAltitudeFL;



    public TMASector(Circle shape, int upperAltitudeFL)
    {
        this.upperAltitudeFL = upperAltitudeFL;
        this.shape = shape;

    }



    @Override

    public boolean isInSector(Coordinate c, int altitude)
    {
        if (altitude > this.upperAltitudeFL)
        {

            return false;

        }


        double distanceToRadius = calculate(c, this.shape.getOrigin());

        return distanceToRadius < this.shape.getRadiusNm();


    }


}
