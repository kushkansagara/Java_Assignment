public class Object_main {

    public static void main(String[] args) {

        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1(5.3, 6.8, 9.9);

        System.out.println(t1.toString());
        t1.print();
        System.out.println();

        System.out.println(t2.toString());
        t2.toString();
        t2.print();

    }

}
