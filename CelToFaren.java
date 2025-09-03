import java.util.Scanner;

public class CelToFaren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a celsius value:");
        int cel = sc.nextInt();
        int far = (cel*9/5) + 32;
        
        System.out.print("fahrenheit of "+cel+" is "+far);
        sc.close();

    }
}
