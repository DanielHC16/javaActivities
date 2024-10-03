package src;

public class Hexagon extends FigureAbstract implements FigureInterface {

    @Override
    public void sides() {
        System.out.println("A Hexagon has 6 sides.");
    }

    @Override
    public void shapeName() {
        System.out.println("Shape: Hexagon");
    }
}
