package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname=input.next();
        System.out.println("Enter your middle name: ");
        String mname=input.next();
        System.out.println("Enter your last name: ");
        String lname=input.next();

        char middleInitial=mname.charAt(0);
        System.out.println(lname+","+fname+" "+middleInitial+".");
    }
}
