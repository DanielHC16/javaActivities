package src;

public class Pentagon extends Figure implements FigureInterface {

    @Override
    public void sides() {
        System.out.println("A Pentagon has 5 sides.");
    }

    @Override
    public void shapeName() {
        System.out.println("Shape: Pentagon");
    }
}
