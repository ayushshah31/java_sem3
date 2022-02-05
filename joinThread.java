class A extends Thread{
    A(String title)
    {
        super(title);
        start();
    }
    @Override
    public void run() {
        System.out.println("Thread " + getName() + " Started");
        
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread " + getName() + " exited\n");
    }
}

class joinThread {
    public static void main(String[] args) {
        A obj1 = new A("Object 1");
        A obj2 = new A("Object 2");
        A obj3 = new A("Object 3");

        System.out.println("Object 1 Alive: " + obj1.isAlive());
        System.out.println("Object 2 Alive: " + obj2.isAlive());
        System.out.println("Object 3 ALive: " + obj3.isAlive());

        try {
            obj1.join();
            obj2.join();
            obj3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Object 1 Alive: " + obj1.isAlive());
        System.out.println("Object 2 Alive: " + obj2.isAlive());
        System.out.println("Object 3 ALive: " + obj3.isAlive());
    }
}
