// Q) Alice wrote a sequence of words in CamelCase as a string of letters, having the following properties:
// It is a concatenation of one or more words consisting of English letters.
// All letters in the first word are lowercase.For each of the subsequent words, 
// the first letter is uppercase and rest of the letters is lowercase.
// Input Format: A single line containing string s.
// Output Format: Print the number of words in string s .
// Sample Input: saveChangesInTheEditor
// Sample Output: 5
// Explanation: String contains five words:saveChangesInTheEditorThus, we print 5 on a new line
import java.util.*;

class WordCount{

    static int calcWords(String input)
    {
        int words=1;
        for(int i=1 ; i<input.length() ; i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                words++;
            }
        }
        return words;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int words = calcWords(input);
        System.out.println(words);
    }
}