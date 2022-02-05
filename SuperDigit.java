import java.util.*;

public class SuperDigit {
    void digitSum(int n,int a,int x)
    {
        if(n>0)
        {
            x += n%10;
            digitSum(n/10,a,x);
        }
        else
        {
            if(a/10 != 0)
            {
                System.out.println("Super Digit(" + a + "): " + x);
                digitSum(x, x, 0);
            }
            else
            {
                System.out.println("Super Digit(" + a + "): " + x);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuperDigit sd = new SuperDigit();
        int n;
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        sd.digitSum(n,n, 0);
    }
}
