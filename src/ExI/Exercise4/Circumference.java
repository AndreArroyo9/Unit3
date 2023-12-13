package ExI.Exercise4;

public class Circumference {
    // Attributes
    private double radius;
    private String colour;
    // Constructor
    public Circumference(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    // Getters and setters
    public double getRadius(){
        return this.radius;
    }
    public String getColour(){
        return this.colour;
    }
    // Methods
    public double area(){
       return Math.PI * (Math.pow(this.radius, 2));
    }
    public void printPerimeter(){
        System.out.println("Perimeter: " + Math.PI * this.radius * 2);
    }
    public boolean isBig(){
        if (area() > 20){
            return true;
        }
        return false;
    }
    public boolean isEqualTo(Circumference c){
        if (c.getColour().equals(this.colour) && c.getRadius() == this.radius){
            return true;
        }
        return false;
    }
    public void show(){
        System.out.println("Circumference: [radius: " + this.radius + ", colour: " + colour + "]");
    }
}
