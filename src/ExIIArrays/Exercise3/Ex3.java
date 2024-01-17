package ExIIArrays.Exercise3;

import java.util.Scanner;

public class Ex3 {
    private float[] array;
    public Ex3(){
        this.array = new float[10];
    }
    public void addNumbers(){
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float prev = num;
        this.array[0]=num;
        int i = 1;
        while (i<10){
            num = sc.nextFloat();
            if (prev>num){
                array[i]=num;
                i++;
            } else {
                System.out.println("This number is not smaller than the previous one");
            }
        }
    }
}
