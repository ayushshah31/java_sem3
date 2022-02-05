class CallMe{
    // synchronized void call(String msg){
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    
    String msg;
    CallMe target;
    Thread t;
    public Caller(CallMe cm , String s){
        target = cm;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        synchronized(target){
        target.call(msg);
        }
    }
}

class Synch{
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "World");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
