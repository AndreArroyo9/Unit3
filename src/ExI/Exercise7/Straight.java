package ExI.Exercise7;
import ExI.Exercise6.Point;
public class Straight {
    // Attributes
    private double width;
    private Point p1;
    private Point p2;
    // Constructor
    public Straight(double width, Point p1, Point p2){
        this.width = width;
        this.p1 = p1;
        this.p2 = p2;
    }
    public Straight(double width, double x1, double y1, double x2, double y2){
        this.width = width;
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    // Methods
    public boolean isHorizontal(){
        if (this.p1.getY() == this.p2.getY()){
            return true;
        }
        return false;
    }
    public boolean isVertical(){
        if (this.p1.getX() == this.p2.getX()){
            return true;
        }
        return false;
    }
    public Point highestPoint(){
        if (this.p1.getY() > this.p2.getY()){
            return this.p1;
        }
        return this.p2;
    }
    public double length(){
        double c1 = this.p2.getX() - this.p1.getX();
        double c2 = this.p2.getY() - this.p1.getY();
        return Math.sqrt(c1 * c1 + c2 * c2);
    }

}
