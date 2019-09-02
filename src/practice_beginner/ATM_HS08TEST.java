package practice_beginner;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
 public class ATM_HS08TEST
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int withdrawAmt = in.nextInt();
        double balance = in.nextDouble();

        if (withdrawAmt % 5 == 0 && withdrawAmt <= (balance - 0.50)) {
            balance = balance - withdrawAmt - 0.50;
        }
        System.out.println(balance);
    }
}
