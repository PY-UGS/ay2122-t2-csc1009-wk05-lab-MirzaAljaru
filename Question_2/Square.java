package Question_2;

public class Square extends Shape {

    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Square.");
        return getDim1() * getDim2();
    }
    
}
