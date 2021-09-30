
import java.util.Scanner;

public class q5 {
    boolean ar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        q5 q = new q5();
        boolean x = q.ar(arr);
        System.out.println(x);
    }
}