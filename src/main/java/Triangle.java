public class Triangle {
    private static int side1;
    private static int side2;
    private static int side3;

    Triangle() {

    }

    public Triangle(int side1, int side2, int side3) {
        Triangle.side1 = side1;
        Triangle.side2 = side2;
        Triangle.side3 = side3;
    }

    private static boolean isTriangle(int side1, int side2, int side3) {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {

                return true;
            }
            System.out.println("Each side must be smaller than sum of the rest");
            return false;
        }
        System.out.println("Side of triangle must be greater than 0");
        return false;
    }

    void classifyTriangle(int side1, int side2, int side3) {
        int sqr1 = side1 * side1;
        int sqr2 = side2 * side2;
        int sqr3 = side3 * side3;

        int sum1 = sqr1 + sqr2;
        int sum2 = sqr1 + sqr3;
        int sum3 = sqr2 + sqr3;

        if (isTriangle(side1, side2, side3)) {
            if (side1 == side2 & side1 == side3) {
                System.out.println("This is an equilateral triangle ");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("This is an isosceles triangle ");
                if (sum1 == sqr3 || sum2 == sqr2 || sum3 == sqr1) {
                    System.out.println("This is a right and isosceles triangle");
                }
            }

            if (sum1 == sqr3 || sum2 == sqr2 || sum3 == sqr1) {
                System.out.println("This is a right triangle");
            } else if (sum1 < sqr3 || sum2 < sqr2 || sum3 < sqr1) {
                System.out.println("This is an acute triangle");
            } else
                System.out.println("This is a triangle");
        }
    }
}
