package src;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Functions clFunctions = new Functions();

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



    }

}
