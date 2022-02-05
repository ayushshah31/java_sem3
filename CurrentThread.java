class ThreadFive extends Thread{

    int num = 5;
    ThreadFive(){
        super("Five");
        System.out.println("Child thread " + this);
    }
    long time = System.nanoTime();
    public void run(){
        try {
            for(int i=1 ; i<=10 ; i++)
            {
                System.out.println(num + "*" + i + " = " + (num*i));
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        time = System.nanoTime() - time;
        System.out.println("Thread time for 5: " + time);
    }
}
class ThreadSeven extends Thread{

    int num = 7;
    ThreadSeven(){
        super("Seven");
        System.out.println("Child thread " + this);
    }
    long time = System.nanoTime();
    public void run(){
        try {
            for(int i=1 ; i<=10 ; i++)
            {
                System.out.println(num + "*" + i + " = " + (num*i));
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        time = System.nanoTime() - time;
        System.out.println("Thread time for 7: " + time);
    }
}
class ThreadThirteen extends Thread{

    int num = 13;
    ThreadThirteen(){
        super("Thirteen");
        System.out.println("Child thread " + this);
    }
    long time = System.nanoTime();
    public void run(){
        try {
            for(int i=1 ; i<=10 ; i++)
            {
                System.out.println(num + "*" + i + " = " + (num*i));
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        time = System.nanoTime() - time;
        System.out.println("Thread time for 13 " + ": " + time);
    }
}

public class CurrentThread {
    public static void main(String[] args) {

        ThreadFive t5 = new ThreadFive();
        ThreadSeven t7 = new ThreadSeven();
        ThreadThirteen t13 = new ThreadThirteen();

        t5.start();
        t7.start();
        t13.start();
    }
}