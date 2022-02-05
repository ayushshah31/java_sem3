// import java.util.*;

// class MetaString{
	
// 	public static void main(String[] args) {
// 		String s1,s2 = new String();
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter String 1: ");
// 		s1 = sc.nextLine();
// 		System.out.print("Enter String 2: ");
// 		s2 = sc.nextLine();
// 		int n=0;
// 		char arr[] = new char[s1.length()];
// 		char str[] = new char[s1.length()];
// 		if(s1.length()==s2.length() & s1 != s2 )
// 		{
// 			for(int i=0; i<s1.length() ; i++)
// 			{
// 				if(s1.charAt(i) != s2.charAt(i))
// 				{
// 					n++;
// 					arr[i] = s1.charAt(i);
// 				}
// 				else
// 				{
// 					arr[i] = ' ';
// 				}
				
// 			}
// 			str = s2.toCharArray();
			
// 			if(n<3)
// 			{
				
// 				for(int i=0;i <s1.length() ; i++)
// 				{
					
// 					if(arr[i] != ' ')
// 					{
// 						str[i] = arr[i];
// 					}
// 				}
// 				String s3 = new String(str);
				
// 				if(s1.equals(s3))
// 				{
// 					System.out.println("The Strings are Meta");
// 				}
// 			}
// 			else
// 			{
// 				System.out.println("The Strings are Not Meta");
// 			}
// 		}
// 		else
// 		{
// 			System.out.println("The Strings are not Meta");
// 		}
// 	}
// }

import java.util.*;

class MetaString{
   public static void main(String[] args) {
       String s1,s2 = new String();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String 1: ");
       s1 = sc.nextLine();
       System.out.print("Enter String 2: ");
       s2 = sc.nextLine();
       int n=0;
       char arr[] = new char[s1.length()];
       char str[] = new char[s1.length()];
       if(s1.length()==s2.length() )
       {
           for(int i=0; i<s1.length() ; i++)
           {
               if(s1.charAt(i) != s2.charAt(i))
               {
                   n++;
                   arr[i] = s1.charAt(i);
               }
               else
               {
                   arr[i] = ' ';
               }
              
           }
           str = s2.toCharArray();
          
           if(n<3 && n!=0)
           {
              
               for(int i=0;i <s1.length() ; i++)
               {
                  
                   if(arr[i] != ' ')
                   {
                       str[i] = arr[i];
                   }
               }
               String s3 = new String(str);
              
               if(s1.equals(s3))
               {
                   System.out.println("The Strings are Meta");
               }
               else
               {
                   System.out.print("else");
                   n=3;
               }
           }
		   else
			{
				System.out.print("else");
				n=3;
			}
       }
       else
       {
           System.out.println("The Strings are not Meta");
       }
   }
}
