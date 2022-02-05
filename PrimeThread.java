class Prime extends Thread{
    int n;
    boolean check;
    Prime(int n){
        this.n = n;
    }
    @Override
    public void run() {
        for(int i=3 ; i<=n ; i++){
            for(int j=2 ; j<i ; j++){
                if(i%j==0){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
            if(check)
            {
                System.out.print(i + "\t");
            }
        }
    }
}

class PrimeThread {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Prime p = new Prime(n);
        if(n<=1)
        {
            System.out.println("1 is neither prime nor composite.");
        }
        else if(n==2)
        {
            System.out.print("Prime No. Less than or Equal to 2:- 2");
        }
        else{
            System.out.print("Prime No. Less than or Equal to " + n + ":-  2\t   ");
            p.start();
        }
    }    
}
