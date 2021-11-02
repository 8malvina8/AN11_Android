enum Color {
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    RED(255, 0, 0);

    private int r, g, b;
    String color;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }


}
