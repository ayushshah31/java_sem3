import java.util.Scanner;
public class sem3_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        String st  = sc.nextLine();
        int count =0;
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) != 'S' && st.charAt(i) != 'O') {
                    count++;
                }
            }
            System.out.println("Count: " + count);
            if(st.length()%3 !=0 )
            {
                count += (3-st.length()%3);
            }
            System.out.println(count);
    }
}