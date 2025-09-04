import java.util.Scanner;
public class SimInt{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter P value:");
       int p = sc.nextInt();
       System.out.println("Enter R value:");
       int r = sc.nextInt();
       System.out.print("Enter T value:");
       int t = sc.nextInt();
       
       double  simpleInt = (p*r*t)/100;
       double  comInt = p*Math.pow((1+r/100),t)-p;                                     

       System.out.println("SimpleInterest of given value is "+simpleInt);
       System.out.println("Compound Interest of given value is "+comInt);
   }
}
// p * Math.pow((1 + r / 100), t) - p;