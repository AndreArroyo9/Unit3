package ExI.Exercise5;

public class Library {
    // Attributes

    // Constructor

    // Methods
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
    public static int digitAmount(int number){
        int x = number;
        int digit = 1;
        while (x / 10 != 0){
            x/=10;
            digit++;
        }
        return digit;
    }
    public static boolean isLong(int number){
        if (digitAmount(number) > 5){
            return true;
        }
        return false;
    }
    public static boolean multipleOf10(int number){
        if (number % 10 == 0){
            return true;
        }
        return false;
    }
}
