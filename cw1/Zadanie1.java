package seminar1.cw1;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int pr = 1;
        while (n!=0) {
            pr = pr*(n%10);
            sum = sum+n%10;
            n = n/10;
        }
        System.out.println(pr-sum);
    }
}
