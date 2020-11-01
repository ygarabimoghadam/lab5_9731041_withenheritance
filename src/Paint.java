import java.util.ArrayList;

public class Paint {

    private ArrayList<Shape> shapes = new ArrayList<>();


    public Paint(){}

    public  void addCircle(Shape c1){
        shapes.add(c1);
    }
    public  void addTriangle(Triangle t1){
        shapes.add(t1);
    }
    public  void addRectangle (Rectangle r1){
        shapes.add(r1);
    }
    public void drawAll(){
        for(Shape c1 : shapes){
            c1.draw();}
        for(Shape t1 : shapes){
            t1.draw();}
        for(Shape r1 : shapes){
            r1.draw();}
    }
    public void printAll(){
        for(Shape c1 : shapes){
            System.out.println(c1.toString());}
        for(Shape t1 : shapes){
            System.out.println(  t1.toString());}
        for(Shape r1 : shapes){
            System.out.println(r1.toString());}
    }
}
