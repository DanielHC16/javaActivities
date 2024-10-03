package src;

public class OverrideFD extends FunctionDiagram{


    // Constructor 
    public OverrideFD(int intNum1, int intNum2) { 
        super(intNum1, intNum2);
    }

    public OverrideFD() {
        //TODO Auto-generated constructor stub
    }

    // Overriding area(int, int)
    public int area(int intNum1, int intNum2){
        return intNum1 % intNum2;
    }
    
}
