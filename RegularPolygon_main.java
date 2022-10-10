public class RegularPolygon_main {

    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(5, 20);
        RegularPolygon p3 = new RegularPolygon(10, 500, 6, 10);

        System.out.println("Polygon 1");
        p1.print();
        System.out.println("Polygon 2");
        p2.print();
        System.out.println("Polygon 3");
        p3.print();

    }

}
