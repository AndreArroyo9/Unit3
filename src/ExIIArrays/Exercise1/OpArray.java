package ExIIArrays.Exercise1;

import java.util.Scanner;

public class OpArray {
    // Attributes
    private int[] a;
    //Constructor
    public OpArray(int[] a){
        a = new int[10000];
    }
    // Methods
    public void loadArray(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //Asign values
        int num= sc.nextInt();
        while (num!=0){
            this.a[count] = num;
            count++;
        }

        //Copy the values from the original array to the new array
        int[] array2 = new int[count];
        for (int i = 0; i < count; i++){
            array2[i]=this.a[i];
        }
        this.a = array2;
    }
    public void display(){
        for (int i = 0; i < this.a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int replace(int number){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.a.length; i++){
            if (this.a[i] == number){
                System.out.println("Which number do you want to replace it with?");
                this.a[i] = sc.nextInt();
                count++;
            }
        }
        sc.close();
        return count;
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < this.a.length; i++){
            s += this.a[i];
        }
        return s;
    }

    public int indexPrime(){
        int index = -1;
        boolean isPrime = true;
        for (int i = 0; i < this.a.length; i++){
            isPrime = true;
            // Check if it is prime
            for (int j = 2; j < this.a[i]-1; j++){
                if (this.a[i]%j==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                return i;
            }
        }
        return -1;
    }

}
