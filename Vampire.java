import java.util.*; 
  
class Vampire{ 
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n,num,k=0;
        int arr[] = new int[4];
        System.out.print("Enter the 4 digit no.: ");
        n = sc.nextInt();
        num = n;
        for(int i=3; i>=0;i--)
        {
            arr[i] = n%10;
            n=n/10;
        }
        for(k=0;k<4;k++)
        {
            if((arr[0]*10 + arr[1])*(arr[2]*10 + arr[3]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[1]) + "*" + (arr[2]*10 + arr[3]));
                break;
            }
            else if((arr[0]*10 + arr[1])*(arr[3]*10 + arr[2]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[1]) + "*" + (arr[3]*10 + arr[2]));
                break;
            }
            else if((arr[0]*10 + arr[2])*(arr[1]*10 + arr[3]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[2]) + "*" + (arr[1]*10 + arr[3]));
                break;
            }
            else if((arr[0]*10 + arr[2])*(arr[3]*10 + arr[1]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[2]) + "*" + (arr[3]*10 + arr[1]));
                break;
            }
            else if((arr[0]*10 + arr[3])*(arr[1]*10 + arr[2]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[3]) + "*" + (arr[1]*10 + arr[2]));
                break;
            }
            else if((arr[0]*10 + arr[3])*(arr[2]*10 + arr[1]) == num )
            {
                System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[3]) + "*" + (arr[2]*10 + arr[1]));
                break;
            }
            else if(k != 4)
            {
                int temp[] = new int[4];
                for(int i=1;i<4;i++)
                {
                    temp[i] = arr[i-1];
                }
                temp[0] = arr[3];
                arr = temp ;
                continue;
            }
        }
        if(k==4)
        {
            System.out.println(num + " is not a Vampire Number");
        }
    } 
} 