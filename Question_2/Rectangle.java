package Question_2;

public class Rectangle extends Shape {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    
    }

    @Override
    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return getDim1() * getDim2();
    }


    
}
