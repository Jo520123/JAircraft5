package JoAirspaceAircraft.airspace;


import JoAirspaceAircraft.geography.Coordinate;

public interface AirSector {

    boolean isInSector(Coordinate c, int altitude);


}
