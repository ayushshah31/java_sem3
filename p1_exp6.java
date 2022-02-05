
import java.util.*;
class Stu{

    Scanner sc = new Scanner(System.in);
    int id,math,phy,chem,total;
    String stname;
    Stu st[] = new Stu[100];
    public void getstudent(int n){
        for(int i=0;i<n;i++){
            st[i] = new Stu();
            System.out.println("\nEnter your Id.no.");
            st[i].id = sc.nextInt();
            System.out.println("Enter your name");
            st[i].stname = sc.next();
            System.out.println("Enter your marks of Math");
            st[i].math = sc.nextInt();
            System.out.println("Enter your marks of Physics");
            st[i].phy = sc.nextInt();
            System.out.println("Enter your marks of Chemistry");
            st[i].chem = sc.nextInt();
        }
        System.out.println();
    }
    public void showstudent(int n){
        Stu temp = new Stu();
        int i,j;
        for(i=0;i<n;i++){
            st[i].total=st[i].math+st[i].phy+st[i].chem;
        }
        for( i=0;i<n;i++){
            for( j=0;j<n-i-1;i++){
                if(st[j].total<st[j+1].total){
                    temp=st[j+1];
                    st[j+1] = st[j];
                    st[j] = temp;
                }
            }
        }
        System.out.println("ID.no\t   St Name\t   Math\t\t Physics\t Chemistry\t Total");
        for(j=0 ; j<n ; j++)
        {
            System.out.print(st[j].id+"\t\t\t"+st[j].stname+"\t\t\t"+st[j].math+"\t\t\t"+st[j].phy+"\t\t\t"+st[j].chem+"\t\t\t"+st[j].total+"\t\t"+"\n");
        }
    }
}

class p1_exp6{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of Students for which you want to enter data");
        int n =sc1.nextInt();
        Stu st = new Stu();
        st.getstudent(n);
        st.showstudent(n);
    }
}

