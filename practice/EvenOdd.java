package practice;
//write a program to check weather number is present or not in array .
//[456,78,23,90,45], num = 90 --> true
//[456,78,23,90,45], num = 123 --> false
public class EvenOdd {

    // 2 - even 2%2 == 0 , 2/2 == 1

    public static void main(String[] args) {
        int a = 5;
        EvenOdd obj1 = new EvenOdd();
        boolean str = obj1.evenOrOdd(a);
        if (str)
            System.out.println("Even");
         else
            System.out.println("Odd");
    }

    public boolean evenOrOdd(int a) {
//        if (a % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return (a % 2 == 0);
    }

}

