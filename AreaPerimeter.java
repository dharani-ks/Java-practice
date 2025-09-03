import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length :");
            int len = sc.nextInt();

            System.out.print("Enter width :");
            int wid = sc.nextInt();

            int area = len*wid;
            int peri = 2 +(len*wid);

            System.out.println("Area of the rectangle is :"+area);
            System.out.println("Perimeter of the rectangle is :"+peri);
        }
        
    }
}
