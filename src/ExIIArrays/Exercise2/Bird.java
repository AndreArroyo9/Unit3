package ExIIArrays.Exercise2;

public class Bird {
    // Attributes
    private char sex;
    private int age;
    private PersonalData names;
    private static int numberBirds = 0;
    // Constructor
    public Bird(char sex, int age, PersonalData names){
        this.sex = sex;
        this.age = age;
        this.names = names;
        this.numberBirds++;
    }
    // Getters and setters
    public char getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public PersonalData getNames(){
        return this.names;
    }
    public void setSex(char sex){
        this.sex = sex;
    }

    // Methods
    public int getNumberBirds(){
        return this.numberBirds;
    }
    public void whoAmI(){
        System.out.println("Sex: " + sex + ", Age: " + age);
    }
    public void sing(){
        System.out.println("My name is " + getNames().getNameBird() + ". I'm a bird.");
    }
}
