package src;

public class FunctionDiagram {
    
    int intNumber1 = 0, intNumber2 = 0, intSum = 0, intProduct = 1;
    double dblNumber1 = 0, dblNumber2 = 0, dblSum = 0, dblProduct = 1;
    
    public FunctionDiagram(int intNum1){
        this.intNumber1 = intNum1;
    }

    public FunctionDiagram(double dblNum1){
        this.dblNumber1 = dblNum1;
    }

    public FunctionDiagram(int intNum1, int intNum2){
        this.intNumber1 = intNum1;
        this.intNumber2 = intNum2;
    }

    public FunctionDiagram(int intNum1, double dblNum1){
        this.intNumber1 = intNum1;
        this.dblNumber1 = dblNum1;
    }

    public FunctionDiagram(double dblNum1, int intNum1){
        this.dblNumber1 = dblNum1;
        this.intNumber1 = intNum1;
    }

    public FunctionDiagram(double dblNum1, double dblNum2){
        this.dblNumber1 = dblNum1;
        this.dblNumber2 = dblNum2;
    }

    public FunctionDiagram() {
        //TODO Auto-generated constructor stub
    }

    public int area(int intNum1){
        return intNum1 * intNum1;
    }

    public int area(int intNum1, int intNum2){
        return intNum1 * intNum2;
    }

    public double area(int intNum1, double dblNum1){
        return intNum1 * dblNum1;
    }

    public double area(double dblNum1, int intNum1){
        return dblNum1 * intNum1;
    }

    public double area(double dblNum1, double dblNum2){
        return dblNum1 * dblNum2;
    }

    public int perfectnumber(int intNum1){
        int intSum = 0;
        for(int intCounter = 1; intCounter <= intNum1 /2; intCounter++){
            if(intNum1 % intCounter == 0){
                intSum += intCounter;
            }
        }
        return intSum;
    }

    public int fibonaccirecursion(int intNum1){
        if (intNum1 == 1 || intNum1 == 2){
            return 1;
        } else
        return fibonaccirecursion(intNum1 - 1) + fibonaccirecursion(intNum1 - 2);
    }



}
