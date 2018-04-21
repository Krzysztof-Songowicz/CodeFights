package arcadeintro.edgeoftheocean;

/*
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1.
An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons
to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 */
public class ShapeArea {
    public static void main(String[] args) {

        System.out.println(shapeArea(1));
        System.out.println(shapeArea(2));
        System.out.println(shapeArea(3));
        System.out.println(shapeArea(4));
        System.out.println(shapeArea(5));
    }

    private static int shapeArea2(int n) {
        if (n == 1)
            return 1;
        return shapeArea(n - 1) + (n - 1) * 4;
    }

    private static int shapeArea(int n) {
        return (n == 1) ? 1 : shapeArea(n - 1) + (n - 1) * 4;
    }
}

// n = 1 = 1    -> 1
// n = 2 = 5    -> n - 1 + 4 pola
// n = 3 = 13   -> n - 1 + 8 pól
// n = 4 = 25   -> n - 1 + 12 pól
// n = 5 = 41   -> n - 1 + 16 pól