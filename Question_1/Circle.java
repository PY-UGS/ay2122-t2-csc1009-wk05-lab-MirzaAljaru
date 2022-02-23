package Question_1;

public class Circle extends GeometricObject {
    private double radius;
    public final static double pi = 3.14159;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = pi * radius * radius;
        return area;
    }
    public double getDiameter(){
        double diameter = (radius * 2);
        return diameter;
    }
    public double getPerimeter(){
        double perimeter = pi * getDiameter();
        return perimeter;
    }
    public void printCircle(){
        System.out.println("A circle " + toString());
    }
    
}
