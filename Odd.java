import java.util.Scanner;

public class Odd {
    public static void oddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.print(sum);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        oddNumbers(n);
        sc.close();

    }
}
