import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number:");
        int a = sc.nextInt();
        System.out.println("Enter B number:");
        int b = sc.nextInt();
        
        int temp = a;
        a = b;
        b = temp;

        

        System.out.println("A is :"+a);
        System.out.println("B is :"+b);
    }
    
}
