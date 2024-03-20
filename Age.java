import java.util.Scanner;

public class Age {
    public static void ageOfVote(int a){
        if (a>18) {
            System.out.println("You are Eligible to Vote");
        } else{
            System.out.println("You are not Eligible to Vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        ageOfVote(a);
        sc.close();
        
    }
}
