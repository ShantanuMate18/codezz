package practice;
public class checkNumberInArray {
    public static void main(String[] args) {
        checkNumberInArray obj1 = new checkNumberInArray();
        int[] arr = {2, 6, 3, 8, 47, 21};
        int num = 4;

        boolean result1 = obj1.isNumberPresent(arr, num);
        System.out.println(result1);
    }

    public boolean isNumberPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}
