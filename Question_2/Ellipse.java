package Question_2;

public class Ellipse extends Shape {
    
        public Ellipse(double dim1,double dim2){
            super(dim1, dim2);
        }
    
        public double area(){
            double area = this.getPI() * this.getdim1() * this.getdim2();
            return area;
        }
    

}
