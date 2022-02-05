import java.util.*;
public class Marks
{
	public static void main(String[] args)
	{
		int i,j,m,n;
		int row_sum=0;
		int column_sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the total no of Students: ");
		m=sc.nextInt();
		System.out.print("Enter the total no of subjects: ");
		n=sc.nextInt();
		System.out.println();
		int a[][]= new int[m+1][n+1];
		for(i=0;i<m;i++)
		{
			System.out.println("Enter the Marks of Student "+(i+1));
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
				row_sum= row_sum+ a[i][j];
			}
			a[i][j]=row_sum;
		}
		System.out.println();
		for(i=0;i<m+1;i++)
		{
			for(j=0;j<n;j++)
			{
				column_sum= column_sum+ a[j][i];
			}
			a[j][i]=column_sum;
		}
		System.out.print("\t\t");
		for(i=0;i<m+1;i++)
		{
			if(i!=m)
			{
				System.out.print("Subject "+(i+1)+"\t");
			}
			else
			{
				System.out.print("| Grand Total");
			}
		}
		System.out.println();
		for(i=0;i<m+1;i++)
		{
			if(i!=m)
			{
				System.out.print("Student "+(i+1)+" ");
			}
			else
			{
				System.out.print("Total  : ");
			}
		}
		System.out.println();
		for(j=0;j<n+1;j++)
		{
			System.out.print(a[i][j] +"\t\t");
		}
		System.out.println();
	}
}