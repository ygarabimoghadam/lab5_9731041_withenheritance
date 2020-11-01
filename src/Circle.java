public class Circle extends  Shape {
    private double radius;
    public Circle(double radius) {
        super(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

@Override
    public double calculatePerimeter(){
        double output = 2*radius*(Math.PI);
        return output;
    }
@Override
    public double calculateArea(){
        double output = radius*radius*(Math.PI);
        return output;
    }
@Override
    public void draw(){
        System.out.println("circle");
        double o = calculateArea();
        double oo = calculatePerimeter();
        System.out.println("area is : "+ o);
        System.out.println("perimeter is : "+ oo);
    }

    public boolean equals(double r){
        boolean check = false ;

        if(r == radius)
            check = true ;
        else
            check = false ;
        return check;
    }
@Override
    public String toString(){
        String s = "this is circule";
        String rad = Double.toString(radius);
        String output = s.concat(rad);
        return output;
    }


}
