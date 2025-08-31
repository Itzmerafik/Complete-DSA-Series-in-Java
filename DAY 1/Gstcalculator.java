import java.util.Scanner;

public class Gstcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pensil=sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser =sc.nextFloat();
        float Total  = pensil+pen+eraser;
        System.out.println("Bill is : "+Total);
        // add on 18%gst
        float GST =Total*18/100;
        float newTotal =Total+GST;
        System.out.println("Bill with 18 % tax :"+newTotal);
    }
}
