package src;

public class Functions{
    //  BSCS 2-2 Sep. 07, 2024
    // Camacho, Daniel Hardy C.
    // King, Mariano Luiz B.
    // Tulang, Timothy John L.

    // 1. Display the area of a given circle.
    // Ex. Input radius = 10
        // The area is 314.16
    
    // 1A. Iterative Function
    public double itecirclearea(int intRadius){
        return Math.PI * Math.pow(intRadius, 2);
    }

    // 1B. Recursive Function
    public double reccirclearea(double dblRadius){
        if(dblRadius == 0)
            return 0;
        else 
            return reccirclearea(dblRadius - 1) + Math.PI;
    }

    



}