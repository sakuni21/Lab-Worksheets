package LW_01;

public class circle {
    double radius;
    circle(double rad){
        radius=rad;

    }
    public double computeArea(){
        double area;
        area=Math.PI*radius*radius;
        return area;
    }
    public double computeCircumference(){
        double circumference;
        circumference=2*Math.PI*radius;
        return circumference;
    }
}
