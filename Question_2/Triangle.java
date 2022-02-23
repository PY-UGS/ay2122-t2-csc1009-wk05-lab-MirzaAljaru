package Question_2;

public class Triangle extends Shape {

    public Triangle(double dim1,double dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = 0.5 * this.getdim1() * this.getdim2();
        return area;
    }
    
}
