package JoAirspaceAircraft;
import JoAirspaceAircraft.airspace.AirSector;
import JoAirspaceAircraft.airspace.EnRouteSector;
import JoAirspaceAircraft.airspace.TMASector;
import JoAirspaceAircraft.geography.Circle;
import JoAirspaceAircraft.geography.Coordinate;
import JoAirspaceAircraft.geography.Rectangle;
import JoAirspaceAircraft.radar.Aircraft;

import java.util.List;


public class Main {

    public static void main(String[] args)
    {

        List<AirSector> badWeatherArea = List.of(
                new TMASector(
                        new Circle(new Coordinate(20,20), 10),
                100),

                new EnRouteSector(200,400,
                        new Rectangle(
                                new Coordinate(0,0),
                                new Coordinate(10, 20),
                                new Coordinate(0,20),
                                new Coordinate(10,0))));


        List<Aircraft> skyAircraft = List.of(

                new Aircraft("OS876", new Coordinate(20, 20), 50 ),
                new Aircraft("RO345", new Coordinate(5,15), 200),
                new Aircraft("TA234", new Coordinate(30, 10), 230)

        );


        //OS876 in TMA,
        //RO345 in


        badWeatherArea.forEach(
                x -> {
                    skyAircraft.forEach(y -> {

                        if (x.isInSector(y.getCoordinate(), y.getAltitudeFL())) {
                            System.out.println("WARNING -> " + y.getCallSign() + "in bad weather sector");

                        }

                    });

                });



    }


}
