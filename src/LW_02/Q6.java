package LW_02;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format= new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(format.format(today));
    }

}
