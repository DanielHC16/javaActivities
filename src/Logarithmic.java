package src;

public class Logarithmic {
    private int intNum1 = 0;

    public Logarithmic(){
        this.intNum1 = 0;
    }

    public Logarithmic(int intNum1){
        this.intNum1 = intNum1;
    }

    public int getNumber(){
        return intNum1;
    }

    public void setNumber(){
        this.intNum1 = intNum1;
    }

    public double computeLn(int intNum1){
        if(intNum1 == 1)
            return 0;
        return Math.log(intNum1) + computeLn(intNum1-1);
    }
}
