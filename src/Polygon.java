import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;

public class Polygon extends Shape {

    private ArrayList<Integer> sides = new ArrayList<>();

    public Polygon(Integer... args){
        //super(args);
        for( Integer a : args)
            sides.add(a);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

}
