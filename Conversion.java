import java.util.Scanner;

public class Conversion {
    public static double conversionRadiustoCircumference(double r){
       double circumference = 2*Math.PI*r;
       System.out.println(circumference);
       return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r");
        double r = sc.nextDouble();
        conversionRadiustoCircumference(r);
        sc.close();
    }
}
