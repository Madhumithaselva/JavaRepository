package se.lexicon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring the year variable
        int year=1900;
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();

        if ((year%4==0)&&(year%100!=0) || (year%400==0))
            System.out.println(year+ " is leap year");
        else
            System.out.println(year + " is not a leap year");



    }
}