public class Main {

    public static void main(String... args) {
       /* Shape circle1 = new Shape(19);
        Shape circle2 = new Circle(3);
        Triangle rect1 = new Triangle(1, 4, 1);
        Polygon rect2 = new Rectangle(8, 5, 8, 5);
        Shape rect3 = new Rectangle(6, 6, 6, 6);
        Polygon tri1 = new Triangle(2, 2, 2);
        Triangle tri2 = new Triangle(4, 4, 6);
        Shape tri3 = new Triangle(2, 2, 2);

        circle1 = circle2;
        rect3 = rect2;
        tri3 =  tri1;
        circle2 = tri3;
        tri3 = tri2;

        rect3 = new Shape(2, 3, 2);
        System.out.println(rect3.toString());*/

        Shape circle1 = new Circle(19);
        Shape circle2 = new Circle(3);

        Shape rect1 = new Rectangle(1, 4, 1, 4);
        Polygon rect2 = new Rectangle(8, 5, 8, 5);
        Rectangle rect3 = new Rectangle(6, 6, 6, 6);

        Shape tri1 = new Triangle(2, 2, 2);
        Shape tri2 = new Triangle(4, 4, 6);

        Paint paint = new Paint();

        paint.addCircle(circle1);
        paint.addCircle(circle2);
       paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        paint.printAll();
    }
}
