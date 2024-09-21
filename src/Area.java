package src;

// 2. Create an overloaded Constructors for a class named Area.
//   Area("Circle",10)
//   Area("Circle",10.0)
//   Area("Rectangle",10,10)
//   Area("Rectangle",10.0,10)
//   Area("Rectangle",10,10.0)
//   Area("Rectangle",10.0,10.0)
//   
//   Create overloaded methods that will compute for the area for circle and rectangle. Observe the use of keyword "this".

public class Area {
    private String shapeType;
    private double radius;
    private double length;
    private double width;
    
    private void computeArea(){
        switch (this.shapeType) {
            case "Circle":
                {
                    double area = Math.PI * this.radius * this.radius;
                    System.out.println("Area of Circle: " + area);
                    break;
                }
            case "Rectangle":
                {
                    double area = this.length * this.width;
                    System.out.println("Area of Rectangle: " + area);
                    break;
                }
            default:
                System.out.println("Invalid Shape");
                break;
        }
    }
    
    public Area(String shapeType, int intRadius){
        this.shapeType = shapeType;
        this.radius = intRadius;
        computeArea();
    }
    
    public Area(String shapeType, double dblRadius){
        this.shapeType = shapeType;
        this.radius = dblRadius;
        computeArea();
    }
    
    public Area(String shapeType, int intLength, int intWidth){
        this.shapeType = shapeType;
        this.length = intLength;
        this.width = intWidth;
        computeArea();
    }
    
    public Area(String shapeType, double dblLength, int intWidth){
        this.shapeType = shapeType;
        this.length = dblLength;
        this.width = intWidth;
        computeArea();
    }
    
    public Area(String shapeType, int intLength, double dblWidth){
        this.shapeType = shapeType;
        this.length = intLength;
        this.width = dblWidth;
        computeArea();
    }
    
    public Area(String shapeType, double dblLength, double dblWidth){
        this.shapeType = shapeType;
        this.length = dblLength;
        this.width = dblWidth;
        computeArea();
    }
    
}

