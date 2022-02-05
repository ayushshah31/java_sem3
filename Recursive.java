import java.util.*;
 
public class Recursive{
   void Gcd(int x,int y)
   {
       int lcm,gcd;
       lcm = Lcm(x,y,(x>y?x:y));
       System.out.println("Lcm: " + lcm);
       gcd = (x*y)/lcm ;
       System.out.println("Gcd: " + gcd);
   }
   int Lcm(int x,int y , int lcm)
   {
  
       if( lcm % x == 0 && lcm % y == 0 ) {
       }
       else{
           lcm++;
           lcm = Lcm(x,y,lcm);
       }
       return lcm;
   }
   int raisedTo(int x, int y)
   {
       if(y>0 && x!=1)
       {
           return x*raisedTo(x,y-1);
       }
       else
       {
           return 1;
       }
 
   }
   void fibo(int a,int b, int n)
   {
       if(n>0 && n!=1)
       {
           int x = a+b;
           System.out.print( x + " , ");
           fibo(b,x,--n);
       }
       else if(n==1)
       {
           int x = a+b;
           System.out.print(x);
       }
   }
   void rev(int n,int x)
   {
       if(n>0)
       {
           x *= 10;
           x += n%10;
           rev(n/10,x);
       }
       else
           System.out.println("Reverse: " + x);
   }
   public static void main(String[] args) {
       //System.out.println("Hello, Ayush here!");
       int x,y,ch,ans=0;
       Recursive obj = new Recursive();
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("\nSelect operation:\n 1.Gcd and Lcm\n 2.x^y\n 3.Fibonacci\n 4.Reverse of Number ");
           System.out.print("Choice: ");
           ch = sc.nextInt();
           switch(ch)
           {
               case 1:
                   System.out.print("Input Num 1: ");
                   x = sc.nextInt();
                   System.out.print("Input Num 2: ");
                   y = sc.nextInt();
                   obj.Gcd(x,y);
                   break;
               case 2:
                   System.out.print("Input Num 1: ");
                   x = sc.nextInt();
                   System.out.print("Input Num 2: ");
                   y = sc.nextInt();
                   ans = obj.raisedTo(x,y);
                   System.out.println("(" + x + ")^(" + y + ") = " + ans);
                   break;
               case 3:
                   System.out.print("Input n: ");
                   x = sc.nextInt();
                   if(x>2)
                   {
                       System.out.print("Fibonacci series for " + x + " terms: 0 , 1 , ");
                       obj.fibo(0,1,x-2);
                   }
                   else if(x==2)
                   {
                       System.out.print("Fibonacci series for " + x + " terms: 0 + 1 ");
                   }
                   else if(x==1)
                       System.out.print("Fibonacci series for " + x + " term: 0");
                   else
                   System.out.println("Invalid Input");
                   break;
               case 4:
                   System.out.print("Input n: ");
                   x = sc.nextInt();
                   obj.rev(x,0);
                   //System.out.print(x);
                   break;
           }
           System.out.print("\nDo you wish to Continue 1/0: ");
           ch = sc.nextInt();
       }while(ch !=0);
      
   }   
}
