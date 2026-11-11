import java.util.Arrays;
import java.util.Scanner;
public class Move_Zero{
    public static void moveZero(int[] arr){
        int write = 0;

        for(int x : arr){
            if (x != 0){
                arr[write] = x;
                write++;
            }
        }
        while (write < arr.length){
            arr[write] = 0;
            write++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 0, 1, 1, 1, 1};
        System.out.println("Orginal array: ");
        moveZero(arr1);
        System.out.println("New array: " + Arrays.toString(arr1));

        int[] arr2 = {1, 0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Orginal array: ");
        moveZero(arr2);
        System.out.println("New array: " + Arrays.toString(arr2));

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Orginal array: ");
        moveZero(arr);
        System.out.println("New array: " + Arrays.toString(arr));
    }
}