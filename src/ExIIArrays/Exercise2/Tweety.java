package ExIIArrays.Exercise2;

public class Tweety extends Canary {
    // Attributes
    private int movies;
    // Constructor
    public Tweety(char sex, int age, PersonalData names, float size, int movies) {
        super(sex, age, names, size);
        this.movies = movies;
    }
    // Methods
    @Override
    public void sing(){
        System.out.println("My name is " + getNames().getNameBird() + ". Pio-pio I'm a tweety");
    }

}
