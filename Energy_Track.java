import java.util.Scanner;
class Energy_Track{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter energy number: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int current = arr[0];
        int best = arr[0];

        int start = 0;
        int end = 0;
        int temp_start = 0;

        for (int i = 1; i < n; i++){
            if (current < 0){
                 current = arr[i];
                 temp_start = i;
            }else {
                current += arr[i];
            }

            if (current > best){
                best = current;
                start = temp_start;
                end = i;
            }
        }
        System.out.println("Energy Array: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("Maximum energy sum" + best);

        System.out.println("Maximum sum subarray: ");
        for (int i = start; i < end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}