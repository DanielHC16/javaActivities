package src;

public class Main {
    
    public static void main(String[] args) {
        Functions clFunctions = new Functions();

        System.out.printf("1A. Iterative Circle Area: %.2f\n", clFunctions.itecirclearea(10));
        System.out.printf("1B. Recursive Circle Area: %.2f\n", clFunctions.reccirclearea(Math.pow(10, 2)));


    }

}
