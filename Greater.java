import java.util.Scanner;

public class Greater {
    public static void greaterNumber(int a, int b){
        if(a>b){
        System.out.println(a);
    }else {
        System.out.println(b);
    }
    return;

    }
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        greaterNumber(a, b);
        sc.close();
    }
}
