import java.util.*;

class ThreadMinimun extends Thread{
    int n,i,min;
    int arr[];
    ThreadMinimun(int arr[],int n,int min)
    {
        this.arr = arr;
        this.n = n;
        this.min = min;
        start();
    }
    public void run(){
        try{
            Thread.sleep(500);
            for(int i=1 ; i<n ; i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Min: " + min);
    }
}
class ThreadMaximum extends Thread{
    int n,i,max;
    int arr[];
    ThreadMaximum(int arr[],int n,int max)
    {
        this.arr = arr;
        this.n = n;
        this.max = max;
        start();
    }
    public void run(){
        try{
            Thread.sleep(500);
            for(int i=1 ; i<n ; i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Max: " + max);
    }
}
class ThreadAverage extends Thread{
    int n,i,sum=0;
    float avg;
    int arr[];
    ThreadAverage(int arr[],int n,float avg)
    {
        this.arr = arr;
        this.n = n;
        this.avg = avg;
        start();
    }
    public void run(){
        try{
            Thread.sleep(500);
            for(int i=0 ; i<n ; i++)
            {
                sum += arr[i];
            }
        } catch(Exception e){
            System.out.println(e);
        }
        avg = (float)sum/n;
        System.out.println("Avg: " +  avg);
    }
}
class WorkerStats{
    public static void main(String[] args) {
        int min,max;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr total no. of Workers: ");
        int n = sc.nextInt();
        int arr[] = new int[n+3];
        System.out.println("Enter Numbers:");
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        avg = 0 ;
        new ThreadMinimun(arr, n,min);
        new ThreadMaximum(arr, n, max);
        new ThreadAverage(arr, n, avg);
    }
}