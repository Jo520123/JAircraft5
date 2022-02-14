package JoAirspaceAircraft.geography;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public interface DistanceCalculator {

    static double calculate(Coordinate x1, Coordinate x2)
    {

        return sqrt(pow((x1.getX()-x2.getX()),2) + pow((x1.getY() - x2.getY()),2));

    }


}
