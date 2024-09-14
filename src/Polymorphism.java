package src;

public class Polymorphism {
     
    // 1. Overload the below method of volume: int double, double double int, double double double
    // int int double, int double int, double int int, int double double, double int double, double double int, double double double
    
    // A. Rectangle
    public int volume(int intLength, int intWidth, int intHeight){
        return intLength * intWidth * intHeight;
    }
    
    // B. Square
    public int volume(int intSide){
        return intSide * intSide * intSide;
    }
    
    // A. Overloading
    public double volume (int intLength, int intWidth, double dblHeight){
        return intLength * intWidth * dblHeight;
    }
    
    public double volume(int intLength, double dblWidth, int intHeight){
        return intLength * dblWidth * intHeight;
    }
    
    public double volume(double dblLength, int intWidth, int intHeight){
        return dblLength * intWidth * intHeight;
    }
    
    public double volume(int intLength, double dblWidth, double dblHeight){
        return intLength * dblWidth * dblHeight;
    }
    
    public double volume(double dblLength, int intWidth, double dblHeight){
        return dblLength * intWidth * dblHeight;
    }
    
    public double volume(double dblLength, double dblWidth, int intHeight){
        return dblLength * dblWidth * intHeight;
    }
    
    public double volume(double dblLength, double dblWidth, double dblHeight){
        return dblLength * dblWidth * dblHeight;
    }
    
    // B. Overloading
    public double volume(double dblSide){
        return dblSide * dblSide * dblSide;
    }
}
   

