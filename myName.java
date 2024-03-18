import java.util.Scanner;

public class myName {
    public static void printMyName(String name){
        System.out.println(name);   
        return;         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }
}