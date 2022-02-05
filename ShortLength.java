import java.util.*;

class ShortLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lowercase String: ");
        String str = sc.nextLine();
        String s1 = new String();
        char arr[] = new char[str.length()];
        
        for(int j=0 ; j<2 ; j++)
        {
            //System.out.println("str: " + str);
            arr = str.toCharArray();
            for(int i=0;i<str.length()-1;i++)
            {
                if(arr[i] == arr[i+1])
                {
                    arr[i] = ' ';
                    arr[i+1] = ' ';
                }
            }
            // String str1 = new String(arr);
            // str1 = str1.trim();
            // System.out.println("str1: " + str1.trim());
            
            s1 = "";
            for(int i=0;i<str.length();i++)
            {
                if(arr[i] != ' ')
                {
                    s1 += arr[i];
                }
            }
            //System.out.println("s1: " + s1);
            str = s1;
        }
        //s1 = s1.trim();
        if(s1 == "")
        {
            System.out.println("Empty String");
        }
        else
        {
            System.out.println("Final String: " + s1.trim());
        }
    }   
}