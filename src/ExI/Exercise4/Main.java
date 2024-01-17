package ExI.Exercise4;

public class Main {
    public static void main(String[] args) {
        Circumference c1 = new  Circumference(5,"red");
        Circumference c2 = new Circumference(4, "blue");
        Circumference c3 = new Circumference(5, "red");
        if (c1.isEqualTo(c3)){
            System.out.println("C1 is equal to C3");
        }
    }

}
