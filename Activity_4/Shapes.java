public class Shapes {
    public enum Shape {
        CIRCLE(2.0), SQUARE(4.0), TRIANGLE(3.0);

        private double sideLength; // Additional data to calculate area and perimeter

        Shape(double sideLength) {
            this.sideLength = sideLength;
        }

        public double calculateArea() {
            switch (this) {
                case CIRCLE:
                    return Math.PI * (sideLength / 2) * (sideLength / 2);
                case SQUARE:
                    return sideLength * sideLength;
                case TRIANGLE:
                    return (Math.sqrt(3) / 4) * sideLength * sideLength;
                default:
                    return 0.0;
            }
        }

        public double calculatePerimeter() {
            switch (this) {
                case CIRCLE:
                    return 2 * Math.PI * (sideLength / 2);
                case SQUARE:
                    return 4 * sideLength;
                case TRIANGLE:
                    return 3 * sideLength;
                default:
                    return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea(
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}