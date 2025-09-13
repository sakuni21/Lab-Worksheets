package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an odd length word: ");
        String word=input.next();

        if((word.length())%2==0){
            System.out.println("The word must hava an odd length!");

        }else{
            int length=word.length();
            System.out.println("The middle character is: "+word.substring(length/2,(length/2)+1));
        }

    }

}
