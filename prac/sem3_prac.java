import java.util.Scanner;
public class sem3_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        String st  = sc.nextLine();
        int count =0;
        for(int i = 0 ; i < st.length() ; i++)
        {
            if(st.charAt(i) != 's' && st.charAt(i) != 'o'){
                count++;
            }
        }
        if(count!=0){
        System.out.println("We print the number of changed letters, which is "+count);
        }
        else {
            System.out.println("Since no character is altered, we print 0");
        }
    }
}