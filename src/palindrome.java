
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        int c=a;
        while(c>0){
            b=b*10 + c%10;
            c=c/10;
        }
        if(b==a)
            System.out.println(a+ " is a palindrome");
        else
            System.out.println(a + " is not a palindrome");
    }

}