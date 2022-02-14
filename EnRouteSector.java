package JoAirspaceAircraft.airspace;

/*
en Route Sector
A polygon sector used for en route flights that happen at cruise altitude

We are using rectangle for simplicity
 */

import JoAirspaceAircraft.geography.Coordinate;
import JoAirspaceAircraft.geography.Rectangle;

public class EnRouteSector implements AirSector{

    private int upperAltitudeFL;
    private int lowerAltitudeFL;


    private Rectangle shape;

    public EnRouteSector(int lowerAltitudeFL, int upperAltitudeFL, Rectangle shape)
    {
        this.lowerAltitudeFL = lowerAltitudeFL;
        this.upperAltitudeFL = upperAltitudeFL;
        this.shape = shape;

    }



    @Override

    public boolean isInSector(Coordinate c, int altitude)
    {
        if (altitude < this.lowerAltitudeFL)
        {

            return false;

        }

        if (altitude > this.upperAltitudeFL)
        {

            return false;

        }


        return shape.containsCoordinate(c);



    }




}
