import java.util.*;

class Student {
    String name;
    int id=0;
    int entry=0;
}

class StudentLottery{

    Student s[] = new Student[100];
    int i=0;

    void addStudents(int id){
        int j=0;
        s[i] = new Student();
        while(s[j].entry != 0 )
        {
            if(s[j].id == id)
            {
                System.out.println("Already Entered");
                return;
            }
            j++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        s[i].name = sc.nextLine();
        s[i].id = id;
        s[i].entry = 1;
        i++;
    }
    void pickWinner(){
        int win;
        win = (int)(Math.random()*(i)) ;
        System.out.println("Lottery Winner is " + s[win].name);
    }
    public static void main(String[] args) {
        int id,ch;
        Scanner sc = new Scanner(System.in);
        StudentLottery lot = new StudentLottery();
        do{
        System.out.print("\nEnter id: ");
        id = sc.nextInt();
        // System.out.print("ID: "+id);
        lot.addStudents(id);
        System.out.print("\nContinue? 1/0 ");
        ch = sc.nextInt();
        }while(ch != 0);
        lot.pickWinner();
    }
}
