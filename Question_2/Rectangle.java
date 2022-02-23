package Question_2;

public class Rectangle extends Shape {
    
    public Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }

    public double area(){
        double area = this.getdim1() * this.getdim2();
        return area;
    }

}
