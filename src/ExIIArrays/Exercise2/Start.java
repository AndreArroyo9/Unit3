package ExIIArrays.Exercise2;

public class Start {
    public static void main(String[] args) {
        PersonalData pd1 = new PersonalData("Piolín", "Juan");
        PersonalData pd2 = new PersonalData("Terreneitor", "Lucía");
        PersonalData pd3 = new PersonalData("María Luisa", "Pedro");
        Tweety t1 = new Tweety('F', 3, pd1 , 2.5f, 6);
        Tweety t2 = new Tweety('M', 5, pd2, 36.7f, 2);
        Tweety t3 = new Tweety('F', 2, pd3, 12.4f, 0);

        
    }
}
