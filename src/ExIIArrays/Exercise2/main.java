package ExIIArrays.Exercise2;

public class main {
    public static void main(String[] args) {
        int n = 3;
        Parrot[] pArray1 = new Parrot[n];
        Parrot[] pArray2 = new Parrot[n];

        Parrot p1 = new Parrot('M', 1, new PersonalData("Parrot1", "Juan"),'N', "Green");
        Parrot p2 = new Parrot('F', 2, new PersonalData("Chocolate", "Lucía"),'S', "Yellow");
        Parrot p3 = new Parrot('M', 3, new PersonalData("Parrot1", "Jorge"),'E', "Red");

        Parrot p4 = new Parrot('F', 4, new PersonalData("Parrot1", "Egoitz"),'O', "Red");
        Parrot p5 = new Parrot('M', 5, new PersonalData("Parrot1", "Leire"),'N', "Blue");
        Parrot p6 = new Parrot('F', 6, new PersonalData("Parrot1", "Juan"),'S', "Green");

        pArray1[0] = p1;
        pArray1[1] = p2;
        pArray1[2] = p3;

        pArray2[0] = p4;
        pArray2[1] = p5;
        pArray2[2] = p6;

        Parrot[] pArray3 = new Parrot[pArray1.length + pArray2.length];
        for (int i = 0; i < pArray1.length; i++){
            pArray3[2 * i] = pArray1[i];
            pArray3[2 * i + 1] = pArray2[i];
        }
        for (int i = 0; i < pArray1.length; i++){
            pArray1[i].sing();
        }
    }

}
