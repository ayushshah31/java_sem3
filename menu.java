import java.util.*;

class menu
{
	static void search(int A[])
	{    
	    Scanner s = new Scanner(System.in);
	    int n, x, flag = 0, i = 0;
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < A.length; i++)
        {
            if(A[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    static void sort(int A[])
    {
    	int temp;
    	for(int i=0;i<A.length;i++)
    	{
            for(int j=0 ; j<A.length -i -1 ; j++)
            {
	    		if(A[j]<A[j+1])
	    		{
	    			temp = A[j];
	    			A[j] = A[j+1];
	    			A[j+1] = temp;
	     		}
            }
    	}
    }
    static int duplicate(int A[],int n)
    {
    	if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (A[i] != A[i+1]){  
                temp[j++] = A[i];  
            }  
         }  
        temp[j++] = A[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++)
        {  
            A[i] = temp[i];  
        }  
        return j;  
    }


	public static void main(String[] args) {
		// BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter Size Of Array: ");
		n = sc.nextInt();
		// n = Integer.parseInt(buff.readLine());
		int Arr[] = new int[n];
		System.out.println("Enter The Elements");
		for(i=0;i<Arr.length;i++)
		{
			// A[j] = Integer.parseInt(buff.readLine());
			Arr[i] = sc.nextInt();
		}
		int length = Arr.length;
		// duplicate(Arr, length);  
		// search(Arr);
		sort(Arr);
		// duplicate(Arr,length);

		for(i=0;i<Arr.length;i++)
		{
			// A[j] = Integer.parseInt(buff.readLine());
			System.out.print(Arr[i]+" ");
		}
		
	}
}