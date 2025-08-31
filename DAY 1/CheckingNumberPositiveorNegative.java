// Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;

public class CheckingNumberPositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0) {
            System.out.println(n+" Is Positive Number");

        } else{
            System.out.println(n+" Is Negative Number");
        }
    }
}