import java.util.*;

class Student{
    String name;
    int id,n;
    double maths,phy,chem,total=0 ;

    Student stud[] = new Student[1000];
    void getdata(int n)
    {
        Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			stud[i] = new Student();
			System.out.println("\nStudent " + (i+1));
			System.out.print("Enter name: ");
			stud[i].name = sc.next();
			System.out.print("Enter id: ");
			stud[i].id = sc.nextInt();
			System.out.print("Enter marks in Maths: ");
			stud[i].maths = sc.nextInt();
			System.out.print("Enter marks in Physics: ");
			stud[i].phy = sc.nextInt();
            System.out.print("Enter marks in Chemistry: ");
			stud[i].chem = sc.nextInt();
		}
    }
    void totalSort(int n)
    {
        Student temp = new Student();
        for(int i=0 ; i<n ; i++)
        {
            stud[i].total = stud[i].maths + stud[i].phy + stud[i].chem ; 
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n-i-1 ; j++)
            {
                if(stud[j].total < stud[j+1].total)
                {
                    temp = stud[j+1];
                    stud[j+1] = stud[j] ; 
                    stud[j] = temp;
                }
            }
        }
    }
    void display(int n)
    {
        System.out.println("\nName \tID \tMaths \t\tPhysics \tChemistry \tTotal");
		for(int i=0 ; i<n; i++)
		{
			System.out.println(stud[i].name +"\t" + stud[i].id + "\t" + stud[i].maths + "\t\t" + stud[i].phy + "\t\t" +stud[i].chem +  "\t\t" + stud[i].total );
		}
    }
}

class Student_Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total no. of Students: ");
        int n = sc.nextInt();
        Student stud = new Student();
        stud.getdata(n);
        stud.totalSort(n);
        stud.display(n);
    }
}