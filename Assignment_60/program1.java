
// Palindrome String

import java.util.Scanner;

class program1 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sobj.nextLine();

        int i = 0;
        int j = str.length()-1;

        while(i<=j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not a Plindrome");
                sobj.close();
                return;
            }

            i++;
            j--;
        }
        
    
        System.out.println("Is Palindrome");
        

        sobj.close();
    }
    
}
