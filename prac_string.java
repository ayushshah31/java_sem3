import java.util.Scanner;

class prac_string
{
// String exchange(){

// }
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int ch =0;
System.out.println("Enter the String : \n");
String string = sc.nextLine();
System.out.println("Enter the Operation to perform: \n");
System.out.println("1.Replace a word\n2.Remove all spaces in the string\n3.Insert word at Specific Point\n4.EXIT\n");
ch=sc.nextInt();
while(ch!=4)
{
    switch(ch)
    {
        case 1:{
            System.out.println("Enter the word to be replaced: \n");
            String old_string = sc.next();
            System.out.println("Enter the word to replace it with: \n");
            String new_string = sc.next();
            String resultStr = string.replaceAll(old_string, new_string);
            System.out.println(resultStr);
            break;}

        case 2: {
            // // int removeSpaces(char[] str){
            // // int count = 0;
            // // for (int i = 0; i < str.length; i++)
            // // if (str[i] != ' ') 
            // // {
            // // str[count++] = str[i];
            // // }
            // // return count;
            // // };
            // char str[] = string.toCharArray();
            // int i = removeSpaces(str);
            // System.out.println(string.valueOf(str).subSequence(0, i));
            // break;
        }

        case 3:
            {
            System.out.println("Enter String to be entered:\n");
            String Second = sc.nextLine();
            System.out.println("Enter the index: ");
            int index = sc.nextInt();
            String newString = new String();
            for (int i = 0; i < string.length(); i++) {
            if (i == index) 
            {
            newString += Second;
            }
            newString += string.charAt(i);
            }
            System.out.println(newString);
            break;    
        }
    }
    System.out.println("1.Replace a word\n2.Remove all spaces in the string\n3.Insert word at Specific Point\n4.EXIT\n");
    ch=sc.nextInt();    
}
}
}