import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Given number is EVEN");
        }else{
            System.out.println("Given number is ODD");
        }
    }
}
