package src;

public class Triangle extends FigureAbstract implements FigureInterface {

    @Override
    public void sides() {
        System.out.println("A Triangle has 3 sides.");
    }

    @Override
    public void shapeName() {
        System.out.println("Shape: Triangle");
    }
}
