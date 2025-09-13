package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length in centimeters: ");
        double centi=input.nextDouble();
        double totalInch=centi/2.54;
        int feet=(int)(totalInch/12);
        double inch= totalInch%12;

        System.out.printf("%.2f centimeters is %d feet and %.2f inches",centi,feet,inch);
    }
}
