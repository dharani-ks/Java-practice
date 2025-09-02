import java.util.Scanner;

public class Findascii {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a char:");
    char ch = sc.next().charAt(0);

    int ascii = ch;

    System.out.println("Ascii value of "+ ch + "is "+ascii);
}
}
