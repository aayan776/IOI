import java.util.Scanner;
public class TargetTracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int total = 0;
        for (int i = 0; i < n; i++){
            total += arr[i];
        }

        System.out.println("Total sum of array = " + total);

        int left_sum = 0;
        int right_sum = total;
        boolean balanced = false;

        for (int i = 0; i < n; i++){
            right_sum -= arr[i];

            if (left_sum == right_sum){
                balanced = true;
                break;
            }
            left_sum += arr[i];
        }

        System.out.println("Left-Right balance: ");
        System.out.println(balanced ? "Balanced Array" : "Unbalanced Array");

        left_sum = 0;
        int equ = -1;

        for (int i = 0; i < n; i++){
            right_sum = total - left_sum - arr[i];

            if (left_sum == right_sum){
                equ = i;
                break;
            }
            left_sum += arr[i];
        }
        if (equ != 1) System.out.println("Equilibrium Index = " + equ);
        else System.out.println("Equilibrium Index not found");

        System.out.println("Enter window size: ");
        int k = sc.nextInt();

        if (k > 0 && k <= n){
            System.out.println("Subarray windows: ");
            for (int i = 0; i <= n - k; i++){
                System.out.print("[ ");

                for (int j = i; j < i + k; j++){
                    System.out.print(arr[j] + " ");
                }

                System.out.print(" ]");
            }
        }else{
            System.out.println("Invalid window size");
        }
    }
}