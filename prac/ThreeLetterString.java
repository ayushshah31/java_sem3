import java.util.*;

class ThreeLetterString {
    
    public static void main(String[] args) {
        System.out.println("Please enter a five letter word: "); 
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n= input.length();
        
        // for (int i = 0; i < input.length(); i++) {             // pos. of 1st letter
        //     for (int j = 0; j < input.length(); j++) {         // pos. of 2nd letter
        //         for (int k = 0; k < input.length(); k++) {     // pos. of 3rd letter
        //             if (i == j || i == k || j == k) 
        //                 continue;  // any letter taken twice? -> skip
        //             System.out.printf("%c%c%c\n", input.charAt(i), input.charAt(j), input.charAt(k));
        //         }
        //     }
        // }
        
        for(int j=1 ; j<3 ; j++)
        {
            for(int i=0 ; i<n ; i++)
            {
                String output = input.charAt(i%n) + "" + input.charAt((i+j)%n) + "" + input.charAt((i+2*j)%n) ;
                System.out.println(output);
            }
        }
    }
}
