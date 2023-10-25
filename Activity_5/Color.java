public class Color{
    public enum CustomColor {
        RED(100, 0, 0),
        ORANGE(0, 100, 0),
        YELLOW(0, 0, 100),
        GREEN(100, 100, 0),
        BLUE(0, 100, 100),
        INDIGO(100, 0, 100);


        private int red;
        private int green;
        private int blue;

        CustomColor(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public void displayRGB() {
            System.out.println(name() + "  Red: " + red + ", Green: " + green + ", Blue: " + blue);
        }
    }

    public static void main(String[] args) {
        CustomColor[] colors = CustomColor.values();

        for (CustomColor color : colors) {
            color.displayRGB();
        }
    }
}

