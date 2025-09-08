import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number1:");
            int num1 = sc.nextInt();
            
            System.out.print("Enter number2 :");
            int num2 = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter ur choice:");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Add")) {
                System.out.println("Sum of two number is "+ (num1+num2));
                
            }else if (choice.equalsIgnoreCase("Sub")) {
                System.out.println("Diff of two number is " +(num1-num2));
            }else if (choice.equalsIgnoreCase("Mul")) {
                System.out.println("Diff of two number is "+(num1*num2));
            }else if (choice.equalsIgnoreCase("Div")) {
                if(num2!=0){
                    System.out.println("Diff of two number is "+(num1/num2));
                }else{
                    System.err.println("Error");
                }
            }else if(choice.equalsIgnoreCase("Mod")) {
                if(num2!=0){
                    System.out.println("Modulas: "+(num1%num2));
                }else{
                    System.err.println("Error");
                }
            }else {
                System.out.println("Ivalid choice");
            }
        }
    }
    
}
