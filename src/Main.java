package src;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        // Activity on Functions 9/7/2024

        Functions clFunctions = new Functions();
        Circle circleFunction = new Circle();
        OverrideCircle ovCircle = new OverrideCircle();

        System.out.printf("1A. Iterative Circle Area: %.2f\n", clFunctions.itecirclearea(10));
        System.out.printf("1B. Recursive Circle Area: %.2f\n", clFunctions.reccirclearea(Math.pow(10, 2)));

        System.out.println("2A. Iterative Sum Series: " + clFunctions.itesumseries(5));
        System.out.println("2B. Recursive Sum Series: " + clFunctions.recsumseries(5));

        System.out.println("3A. Iterative Digit Counter: " + clFunctions.itecoundigit(123456789));
        System.out.println("3B. Recursive Digit Counter: " + clFunctions.reccountdigit(987654321));

        System.out.println("4A. Iterative Reversed Digits: " + clFunctions.itereverseddigits(12345));
        System.out.println("4B. Recursive Reversed Digits: " + clFunctions.recreverseddigits(6578, 0));


        char[] arrayOfChar = {'d', 'a', 'n', 'i', 'e', 'l', 'p','o','g','i'};
        char keyToSearch = 'o';

        
        System.out.println("Array of chars: " + Arrays.toString(arrayOfChar));
        System.out.println("Key to search: " + keyToSearch);

        System.out.print("5A. Iterative Key Searching: ");
        if(clFunctions.itesearchkey(keyToSearch, arrayOfChar))
            System.out.println("`" + keyToSearch + "` is found in the array");
        else
            System.out.println("`" + keyToSearch + "` is not found in the array");
        
        System.out.print("5B. Recursive Key Searching: ");
        if(clFunctions.recsearchkey(keyToSearch, arrayOfChar, 0))
            System.out.println("`" + keyToSearch + "` is found in the array");
        else
            System.out.println("`" + keyToSearch + "` is not fonud in the array");

        System.out.println("Circle Area Int: " + circleFunction.area(10));
        System.out.println("Circle Area Double: " + circleFunction.area(10.10));

        System.out.println("Overriden Circle Int: " + ovCircle.area(10));
        System.out.println("Overriden Circle Double: " + ovCircle.area(10.10));

    

    // Activity on Encap Abstraction 9/21/2024

        new Area("Circle", 10);           // int radius
        new Area("Circle", 10.0);         // double radius
        new Area("Rectangle", 10, 10);    // int length, int width
        new Area("Rectangle", 10.0, 10);  // double length, int width
        new Area("Rectangle", 10, 10.0);  // int length, double width
        new Area("Rectangle", 10.0, 10.0);// double length, double width

        // Create objects for different figures
        Figure circle = new Circle();
        Figure triangle = new Triangle();
        Figure hexagon = new Hexagon();
        Figure pentagon = new Pentagon();

        // Circle
        circle.description();
        circle.sides();
        circle.shapeName();
        
        System.out.println(); 
        // Triangle
        triangle.description();
        triangle.sides();
        triangle.shapeName();

        System.out.println(); 

        // Hexagon
        hexagon.description();
        hexagon.sides();
        hexagon.shapeName();

        System.out.println(); 

        // Pentagon
        pentagon.description();
        pentagon.sides();
        pentagon.shapeName();

    }
}
