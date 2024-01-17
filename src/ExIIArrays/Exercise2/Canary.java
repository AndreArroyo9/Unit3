package ExIIArrays.Exercise2;

public class Canary extends Bird {
    // Attribute
    private float size;
    // Constructor
    public Canary(char sex, int age, PersonalData names){
        super(sex, age, names);
        this.size = 0.0f;
    }
    public Canary(char sex, int age, PersonalData names, float size) {
        super(sex, age, names);
        this.size = size;
    }
    // Getters and setters
    public void setSize(float size){
        this.size = size;
    }
    // Methods
    public void height(){
        if (this.size > 30){
            System.out.println("High");
        } else if (this.size >= 15) {
            System.out.println("Middle");
        } else {
            System.out.println("Little");
        }
    }
    @Override
    public void sing(){
        System.out.println("My name is " + getNames().getNameBird() + ". Pio-pio I'm a canary");
    }
}
