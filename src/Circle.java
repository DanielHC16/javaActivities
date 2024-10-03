package src;

public class Circle extends FigureAbstract implements FigureInterface {
    public double area (double dblRadius){
        return Math.PI * dblRadius * dblRadius;
    } 
   
    public double area(int intRadius){
         return Math.PI * intRadius * intRadius;
     }

     // 9/21/2024

   @Override
   public void sides() {
       System.out.println("A Circle has no sides.");
   }
  
   @Override
   public void shapeName() {
       System.out.println("Shape: Circle");
   }
     
 }

