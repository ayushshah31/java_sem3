import java.util.*; 
  
class Student { 
Scanner sc= new Scanner(System.in); 
int rollno; 
} 
  
class Test extends Student{ 
double sem1_marks,sem2_marks; 
} 
  
interface Sports{ 
void score(); 
} 
  
class Result extends Test  implements Sports{ 
double total,sports_marks; 
void getData(){ 
System.out.print("Enter Rollno: "); 
rollno = sc.nextInt(); 
System.out.print("Enter Sem1 Marks: "); 
sem1_marks = sc.nextDouble(); 
System.out.print("Enter Sem2 Marks: "); 
sem2_marks = sc.nextDouble(); 
} 
public void score(){ 
System.out.print("Enter Sports Marks: "); 
sports_marks = sc.nextDouble(); 
total = sem1_marks  + sem2_marks + sports_marks ; 
} 
void display() 
{ 
System.out.println(); 
System.out.println("The Sem1 Marks: " + sem1_marks); 
System.out.println("The Sem2 Marks: " + sem2_marks); 
System.out.println("The Sports Marks: " + sports_marks);
System.out.println("The Total Marks: " + total); 
}
}
 
class InterfaceExp{ 
public static void main(String[] args) { 
Result r1 = new Result(); 
r1.getData(); 
r1.score(); 
r1.display(); 
} 
} 