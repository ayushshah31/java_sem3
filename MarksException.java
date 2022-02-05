import java.util.*;
class MarksOutOfBounds extends Exception{
    MarksOutOfBounds(String str){
        super(str);
    }
}

class MarksException{

    static void check(double marks) throws MarksOutOfBounds{
        if(marks<0 || marks>100)
        {
            throw new MarksOutOfBounds("Invalid input of Marks, 0<=Mark<=100");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter total no. of Subjects: ");
        int sub = sc.nextInt();
        double marks[] = new double[sub];
        for(int i=0 ; i<sub ; i++)
        {
            try{
                System.out.print("Enter Marks of Subject "+ (i+1) + ": ");
                marks[i] = sc.nextDouble();
                check(marks[i]);
            } catch(MarksOutOfBounds m){
                System.out.println("\nException Occured");
                System.out.println(m);
                System.out.println("Mark will be considered as 0\n");
                marks[i]=0;
            }
        }
        for(int i=0 ; i<sub ; i++)
        {
            System.out.println("Marks of Subject " + (i+1) + " is: " + marks[i]);
        }
    }
}