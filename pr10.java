interface comparable
{

    default public void compare(double side1,double side2) {

        if (side1 == side2) {
            System.out.println();
            System.out.println("The Square and ColorableSquare is Same...");
        } else {
            System.out.println("The Square and ColorableSquare is NOT Same...");
        }
    }
}

class squre {
    protected double side1;

    public double gets() {
        return side1;
    }

    public void sets(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class ComparableSquare extends squre implements comparable {
    protected double side2;

    public double gets2() {
        return side2;
    }

    public void sets2(double side2) {
        this.side2 = side2;
    }

    public void area1() {
        System.out.println();

        System.out.println("The area of Colorablesquare is : " + this.side2 * this.side2);
    }
}

class Prac10 {
    public static void main(String[] args) {
        ComparableSquare t=new ComparableSquare();
        t.sets(12);
        t.gets();
        t.area();
        t.sets2(12);
        t.gets2();
        t.area1();
        t.compare(12,12);
    }
}
