
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int c=0,b=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==6)
                c=i;
            else if(a[i]==7)
                b=i;
        }
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            if(i>= c && i<= b)
                continue;
            sum +=a[i];
        }
        System.out.println(sum);
    }
}
