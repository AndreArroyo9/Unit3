package ExI.Exercise1;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(1.1, 13, "Banana");
        p.printProduct();
        Product p2 = new Product(1.1, 13, "Banana");
        if (p.equals(p2)){
            System.out.println("It is the same product");
        } else {
            System.out.println("It is not the same product");
        }
    }
}
