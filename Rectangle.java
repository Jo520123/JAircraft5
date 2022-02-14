package JoAirspaceAircraft.geography;

import java.util.List;

public class Rectangle {

    private List<Coordinate> coordinates;

    public Rectangle(Coordinate x1, Coordinate x2, Coordinate x3, Coordinate x4)
    {
        if (x1 == null || x2 == null || x3 == null || x4 ==null)
        {

            throw new IllegalArgumentException("Can't not build rectangle");

        }

        this.coordinates = List.of(x1, x2, x3, x4);


    }


    public boolean containsCoordinate(Coordinate x)
    {

        /* Determine max and min values for coordinate and check if point is between them*/

        int maxX = coordinates.stream().mapToInt(Coordinate::getX).max().getAsInt();
        int maxY = coordinates.stream().mapToInt(Coordinate::getY).max().getAsInt();
        int minX = coordinates.stream().mapToInt(Coordinate::getX).min().getAsInt();
        int minY = coordinates.stream().mapToInt(Coordinate::getY).min().getAsInt();

        return x.getX() <= maxX && x.getX() >= minX && x.getY() <= maxY && x.getY() >= minY;

    }



}
