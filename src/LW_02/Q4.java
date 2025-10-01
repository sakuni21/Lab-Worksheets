package LW_02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("Enter 5 integers: ");
        for(int i=0;i<5;i++){
            numbers[i]=input.nextInt();
        }
        int[] largest= Arrays.stream(numbers).sorted().toArray();
        System.out.println("The second largest number is: "+largest[3]);
    }


}
