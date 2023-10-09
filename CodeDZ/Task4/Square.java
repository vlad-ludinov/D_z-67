package Task4;

public class Square implements Figure {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return width * width;
    }

}
