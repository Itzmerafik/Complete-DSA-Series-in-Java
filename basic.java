package Loops.Functios;

import java.util.Scanner;

public class basic {
    /*public static void printHelloworld(){
        System.out.println("Hello world");
    }
    public static int multiply(int a, int b){//parame
        int Product=a*b;
        return Product;

    }
    
/* int a=3;
int b =5;
int Product = multiply(a, b);
System.out.println("a*b = "+Product);
Product=multiply(10, 20);
System.out.println("a*b = "+Product); */

public static int factorial(int n){
    int f=1; 
    for(int i=1;i<=n;i++){
f=f*i;
    }
    return f;
} 
public static int binCoeff(int n, int r){
   int fact_n=factorial(n);
   int fact_r=factorial(r);
   int fact_nmr=factorial(n-r);
int binCoeff=fact_n / (fact_r*fact_nmr);
return binCoeff;
}
public static int sum(int a, int b){
    return a+b;
}
public static double sum(double a,double b){
    return a+b;
}
public static boolean isPrime(int n){
    // corner cases
    //2
    if (n==2) {
        return true;
    }
    for(int i =2;i<=Math.sqrt(n);i++){
        if (n%i==0) {
            return false;
        }
            
    }
    return true;
}
public static void primesInRange(int n){
    for(int i=2;i<=n;i++){
        if (isPrime(i)) {
            System.out.print(i+" ");
        }
    }
    System.out.println();
}
public static void binToDecimal(int binNum){
    int myNum=binNum;
    int decNum =0;
    int pow=0;
    while (binNum>0) {
        int lastDigit= binNum % 10; // to extract the lastdigit we have to % by 10 with the given binary number
        decNum=decNum+(lastDigit*(int)Math.pow(2, pow));// in this we will get the decimal value for each digit
        pow++; // power will increse with each iteration
        binNum=binNum/10; // after we ger the dec we have to short the number ex (101->10 ,10->1) like that
        
        
        
    }
    System.out.println("decimal of "+myNum+" ="+decNum);// it will print the final result
    
}
public static void decToBin(int n){
int myNum=n;
int pow=0;
int binNum=0;
while (n>0) {
    int remaider = n% 2;// always gives the last digit of num
 binNum=binNum+(remaider*(int)Math.pow(10, pow));
 pow++;
 n=n/2; // removes the last digit 
}
System.out.println("binary form of "+myNum+" ="+binNum);
}
// write a java method to compute the average of three numbers
public static int avrgOfNumbers(int a,int b,int c){
    return (a+b+c)/3;
}
//Write a method named isEven that accepts an int argument The method 
//should return true if the argument iseven,or false otherwise. Also write a program to test you
public static boolean isEven(int n){
     if (n%2==0) {
        System.out.println("the number is even");
        return true;
        
     }
     else{
        System.out.println("the number is odd");
        return false;
     }
}
public static void hollow_Rectangle(int toTalRows ,int toTalCols){

    //outer loop 
    for(int i=1;i<=toTalRows;i++){
        //inner loop
        for(int j=1;j<=toTalCols;j++){
            //boundary condition (i,j)
            if (i==1 || i== toTalRows || j==1 || j==toTalCols ) {
                System.out.print("*");
                
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void inverted_rotated_half_pyramid(int n){
    //o(uter loop
    for(int i=1;i<=n;i++){
        //spaces 
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars 
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
System.out.println();
    }
}
public static void inverted_rotated_half_pyramid_numbers(int n){
    //outer loop
    for(int i =1;i<=n;i++){
    //inner loop
    for(int j=1;j<=n-i+1;j++){
System.out.print(j+" ");
    }
    System.out.println();
}
}
public static void floyds_Triangle(int n){
    //outer loop
    int counter=1;
    for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
        System.out.print(counter+" ");
        counter++;
    }
    System.out.println();
}
}
public static void zero_one_triangle(int n){
    for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
            if ((i+j)%2==0) {
                System.out.print("1");
                
            } else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
public static void butterfly_Pattern(int n){
    //outer loop 1st half
    for(int i=1;i<=n;i++){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n;i>=1;i--){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
       // star i
       for(int j=1;j<=i;j++){
        System.out.print("*");
       }
       System.out.println();
    }
}
public static void solid_rhombus(int n){
    //outer loop
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars
        for(int k=1;k<=n;k++){
            System.out.print("*");
        }
        System.out.println();;
    }
}
public static void hollow_rhombus(int n){
    //outer line
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //hollow rectangle -stars
        for(int j=1;j<=n;j++){
            if (i==1||i==n||j==1||j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}

public static void dimond_Pattern(int n){
    //outer loop 1st half
    for(int i=1;i<=n;i++){
        //inner loop -> spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars 
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half outer line
    for(int i=n;i>=1;i--){
        //inner loop spaces
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
    }//stars
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
public static void k_pattern(int n){
    //outer loop 
    for(int i=n;i>=1;i--){
        //inner loop -> stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half outer loop
    for(int i=1;i<=n;i++){
        //inner loop ->stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void palindromeNum(int n){
    for()
}

public static void main(String[] args) {
k_pattern(6);
}
}
 