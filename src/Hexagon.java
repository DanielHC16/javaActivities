package src;

public class Hexagon extends Figure implements FigureInterface {

    @Override
    public void sides() {
        System.out.println("A Hexagon has 6 sides.");
    }

    @Override
    public void shapeName() {
        System.out.println("Shape: Hexagon");
    }
}
