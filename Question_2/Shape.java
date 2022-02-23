package Question_2;

public abstract class Shape {
    private final static double PI = 3.14159;
    private double dim1;
    private double dim2;

    public Shape(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;

    }
    public abstract double area();

    public double getdim1(){
        return dim1;
    }
    public void setdim1(double dim1){
        this.dim1 = dim1;
    }
    public double getdim2(){
        return dim2;
    }
    public void setdim2(double dim2){
        this.dim2 = dim2;
    }
    public double getPI(){
        return PI;
    }

}
