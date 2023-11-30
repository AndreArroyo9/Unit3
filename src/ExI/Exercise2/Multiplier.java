package ExI.Exercise2;

public class Multiplier {
    // Attributes
    private int number;

    // Constructor
    public Multiplier(int number) {
        this.number = number;
    }

    // Getters and Setters
    public int getNumber() {
        return this.number;
    }

    // Methods
    public int multiply(int otherNumber) {
        return otherNumber * this.number;
    }
}
