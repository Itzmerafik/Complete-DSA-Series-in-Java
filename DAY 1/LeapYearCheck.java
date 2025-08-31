//Leap year check
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int Year = sc.nextInt();
        if(Year%4==0|| Year%400==0){

            System.out.println("It is a Leap Year"); 
        } else{
            System.out.println("It is not leap year");
        }
        
        }
    }


