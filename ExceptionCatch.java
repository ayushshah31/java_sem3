import java.util.*;

import javax.print.PrintException;

public class ExceptionCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no. of elements: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int valid = 0 , invalid=0 ;
        System.out.println("Enter Elements:");
        for(int i=0 ; i<n ; i++)
        {
            try {
                arr[i] = sc.nextInt();
                valid++;
            } catch (Exception e) {
                arr[i]=(int) sc.nextDouble();
                invalid++;
            }
        }  
        System.out.println("Valid Integers: " + valid);
        System.out.println("Invalid Integers: " + invalid);
    }
}
