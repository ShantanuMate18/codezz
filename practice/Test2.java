

package practice;

public class Test2 {
    int mulTwoNumber(int a,int b)
    {
        return a*b;
    }

    public static void main(String[] args)
    {
        int a=10;
        int b=26;
        Test2 obj1 = new Test2();
        obj1.mulTwoNumber(a,b);
        System.out.println(obj1.mulTwoNumber(a,b));
    }

}
