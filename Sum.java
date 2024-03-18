import java.util.Scanner;

public class Sum {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        System.out.println("The Sum of a + b is: "+sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        calculateSum(a, b);
        sc.close();
    }

}
