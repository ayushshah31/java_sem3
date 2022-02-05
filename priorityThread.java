// Program 1:
// class priorityThread implements Runnable {
//     @Override
//     public void run() {
//         System.out.println(Thread.currentThread());
//     }

//     public static void main(String[] args) {
//         priorityThread pt = new priorityThread();
//         Thread t = new Thread(pt,"New Thread");
//         System.out.println(t.getPriority());
//         System.out.println(t.getName());
//          t.start();
//     }
// }

// Program 2
class priorityThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        priorityThread pt = new priorityThread();
        Thread t1 = new Thread(pt,"t1");
        Thread t2 = new Thread(pt,"t2");
        Thread t3 = new Thread(pt,"t3");
        t1.setPriority(7);
        t2.setPriority(8);
        t3.setPriority(3);
        System.out.println("Thread Name: " +t1.getName());
        System.out.println("Priority of Thread t1: " + t1.getPriority());
        
        System.out.println("Thread Name: " +t2.getName());
        System.out.println("Priority of Thread t2: " + t2.getPriority());
        
        System.out.println("Thread Name: " +t3.getName());
        System.out.println("Priority of Thread t3: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
