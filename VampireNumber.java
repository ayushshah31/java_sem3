import java.util.*; 
  
class VampireNumber{ 
    void checkVampire(int arr[],int num,int count)
    {
        
        if(multiplyCheck(arr[0],arr[1],arr[2],arr[3],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[1]) + "*" + (arr[2]*10 + arr[3]));
        }
        else if(multiplyCheck(arr[0],arr[1],arr[3],arr[2],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[1]) + "*" + (arr[3]*10 + arr[2]));
        }
        else if(multiplyCheck(arr[0],arr[2],arr[1],arr[3],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[2]) + "*" + (arr[1]*10 + arr[3]));
        }
        else if(multiplyCheck(arr[0],arr[2],arr[3],arr[1],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[2]) + "*" + (arr[3]*10 + arr[1]));
        }
        else if(multiplyCheck(arr[0],arr[3],arr[1],arr[2],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[3]) + "*" + (arr[1]*10 + arr[2]));
        }
        else if(multiplyCheck(arr[0],arr[3],arr[2],arr[1],num))
        {
            System.out.println(num +" is a Vampire no.\n" + num + " = " +(arr[0]*10 + arr[3]) + "*" + (arr[2]*10 + arr[1]));
        }
        else if(count != 4)
        {
            arr = rotateArray(arr);
            checkVampire(arr, num, count+1);
        }
        else
        {
            System.out.println(num + " is not a Vampire number");
        }

    }
    Boolean multiplyCheck(int a,int b,int c, int d,int num)
    {
        int s1,s2;
        s1 = a*10 + b;
        s2 = c*10 + d;    
        if(s1*s2 ==num)
        {
            return true;
        }
        return false;
    }
    int[] rotateArray(int arr[])
    {
        //rotate array clockwise
        int temp[] = new int[4];
        for(int i=1;i<4;i++)
        {
            temp[i] = arr[i-1];
        }
        temp[0] = arr[3];
        return(temp);
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int n,num;
        VampireNumber vn = new VampireNumber();
        int arr[] = new int[4];
        System.out.print("Enter the 4 digit no.: ");
        n = sc.nextInt();
        num = n;
        for(int i=3; i>=0;i--)
        {
            arr[i] = n%10;
            n=n/10;
        }
        vn.checkVampire(arr, num, 0);
    } 
} 