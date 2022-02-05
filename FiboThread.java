import java.util.*;

class Fibonacci extends Thread{
    int n;
    public int arr[] = new int[200];
    Fibonacci(int n)
    {
        this.n = n;
    }
    
    public void run() {
        arr[0]=0;
        arr[1]=1;
        for(int i=2 ; i<n ; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
}

class FiboThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Fibonacci f = new Fibonacci(n);
        f.start();
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(f.arr[i] + "\t");
        }
    }    
}
