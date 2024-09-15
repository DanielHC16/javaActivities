package src;

public class OverrideCircle extends Circle {
    @Override
    public double area(double dblRadius){
        return Math.PI * dblRadius;
    }
    
    @Override
    public double area(int intRadius){
        return Math.PI * intRadius;
    }
}
