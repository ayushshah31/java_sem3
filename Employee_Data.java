import java.util.*;

class Employee{
	int empid;
	String empname;
	String designation;
	int salary;
	char grade;
	Employee emp[] = new Employee[100];
	
	void getemployee(int n)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			emp[i] = new Employee();
			System.out.println("\nEmployee " + (i+1));
			System.out.print("Enter name: ");
			emp[i].empname = sc.next();
			System.out.print("Enter id: ");
			emp[i].empid = sc.nextInt();
			System.out.print("Enter Designation: ");
			emp[i].designation = sc.next();
			System.out.print("Enter Salary: ");
			emp[i].salary = sc.nextInt();
		}
	}
	void showemployee(int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0;j<n-i-1 ; j++)
			{
				if(emp[j].salary<emp[j+1].salary)
				{
					Employee temp = new Employee();
					temp = emp[j+1];
					emp[j+1] = emp[j];
					emp[j] = temp;
				}
			}
		}
		System.out.println("\n-------------------------------------------------");
		System.out.println("Name \tID \tDesignation \tSalary \tGrade");
		for(int i=0 ; i<n; i++)
		{
			System.out.println(emp[i].empname +"\t" + emp[i].empid + "\t" + emp[i].designation + "\t\t" + emp[i].salary + "\t" +emp[i].grade );
		}
	}
	void showgrade(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(emp[i].salary>2500000)
			{
				emp[i].grade = 'A';
			}
			else if(emp[i].salary>1500000)
			{
				emp[i].grade = 'B';
			}
			else if(emp[i].salary>1000000)
			{
				emp[i].grade = 'C';
			}
			else
			{
				emp[i].grade = 'D';
			}
		}
		System.out.println("\n-----------------------");
		System.out.println("Name \tSalary \tGrade");
		for(int i=0 ; i<n; i++)
		{
			System.out.print(emp[i].empname +"\t" + emp[i].salary + "\t" + emp[i].grade + "\n");
		}
	}
}
class Employee_Data
{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total no. of Employee: ");
		n = sc.nextInt();
		Employee emp = new Employee();
		emp.getemployee(n);
		emp.showgrade(n);
		emp.showemployee(n);
	}
}