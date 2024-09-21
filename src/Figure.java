package src;

public abstract class Figure {
    
// Common method implementation
    
public void description(){
    System.out.println("All figures have dimensions.");
}

abstract void sides();
abstract void shapeName();

}
