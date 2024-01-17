package ExIIArrays.Exercise2;

public class Parrot extends Bird {
    // Attributes
    private char region;
    private String colour;
    // Constructor

    public Parrot(char sex, int age, PersonalData names, char region,  String colour) {
        super(sex, age, names);
        this.region = region;
        this.colour = colour;
    }
    // Getters and setters
    public void setRegion(char region){
        this.region = region;
    }
    // Methods
    public void whereAreYouFrom(){
        switch (this.region){
            case 'N':
                System.out.println("North");
                break;
            case 'S':
                System.out.println("South");
                break;
            case 'E':
                System.out.println("East");
                break;
            case 'W':
                System.out.println("West");
                break;
            default:
                System.out.println("ERROR");
        }
    }
    @Override
    public void sing(){
        String x = getNames().getNameBird();
        System.out.println("My name is " + x + ". Pio-pio cute parrot");
    }
}
