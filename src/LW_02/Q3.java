package LW_02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the pyramid: ");
        int row=input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int p=1;p<=(2*i-1);p++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
