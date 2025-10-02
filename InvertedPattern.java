package Loops;

public class InvertedPattern {
     public static void main(String[] args) {
        int n=7;
        //outer loop
        for(int line=1;line<=n;line++){
            //inner loop
            for(int star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

