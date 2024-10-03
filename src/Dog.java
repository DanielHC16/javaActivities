package src;

public class Dog extends AnimalAbstract {
    
    public Dog(int intAge){
        this.intAge = intAge;
        this.strKind = "Dogger";
    }

    public void animalSound(String strKind){
        switch (strKind.toLowerCase()){
            case "dogger":
                System.out.println("Woof! Woof!");
                break;
            case "cat":
                System.out.println("Mrawww");
                break;
            case "bird":
                System.out.println("Tweet! Tweet!");
                break;
            case "fish":
                System.out.println("Blub Blub");
                break;
            default:
            System.out.println("We have to discover this one!");
        }
    }

    public void animalSkin(String strKind){
        switch (strKind.toLowerCase()){
            case "dogger":
            case "cat":
                System.out.println("Has fur");
                break;
            case "bird":
                System.out.println("Has feathers");
                break;
            case "fish":
                System.out.println("Has scales");
            default:
                System.out.println("Hmmm... cannot distinguish the skin of " + strKind);
        }
    }

}
