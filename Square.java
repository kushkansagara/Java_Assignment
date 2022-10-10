public class Square extends GeometricObject implements Colorable{

    private double side;

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square() {
        side = 0;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square: side = " + side;
    }

    public void print() {
        System.out.println("Perimeter of Square: " + getPerimeter());
        System.out.println("Area of Square: " + getArea());
    }

}

