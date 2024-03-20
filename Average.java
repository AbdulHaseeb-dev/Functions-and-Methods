import java.util.Scanner;

public class Average {
    public static int calculateAverage(int a,int b, int c){
        int average = (a+b+c)/3;
        System.out.println("The average of a, b and c is :"+ average);
        return average;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        calculateAverage(a, b, c);
        sc.close();
    }
}
