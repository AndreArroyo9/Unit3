package ExI.Exercise1;

public class Product{
    // Attributes
    private double price;
    private int amount;
    private String name;


    // Constructor
    public Product(double price, int amount, String name) {
        this.price = price;
        this.amount = amount;
        this.name = name;

    }

    //Getters and setters
    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Product p) {
        //El "this." es para el objeto que llama a la función en el main *p.*equals(x) y los getters para el objeto que utiliza la función equals(*Product p*).
        if (p.getAmount()==this.amount && p.getName()==this.name && p.getPrice()==this.price){
            return true;
        }
        return false;
    }

    // Methods
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }


}
