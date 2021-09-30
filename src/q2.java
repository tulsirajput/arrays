
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= {12,34,56,78,7};
        int b = sc.nextInt();
        int f=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b) {
                System.out.println(i);
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println(-1);
    }
}