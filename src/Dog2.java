package src;

public class Dog2 implements AnimalInterface{
    
    public void animalSound(String strKind){
        System.out.println(strKind + " says: Woof Woof");
    }

    public void animalAge(int intAge){
        intAge = 2;
        System.out.println("Dog is: " + intAge + " old");
    }

    public void animalFeet(String strKind){
        System.out.println(strKind + " has 4 legs");
    }

    public void animalSkin(String strKind){
        System.out.println(strKind + " has Fur");
    }


}

