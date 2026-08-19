import java.util.Scanner;

class program5 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        
        System.out.println("Enter 1st String");
        String str1 = sobj.nextLine();
        
        System.out.println("Enter 2nd String");
        String str2 = sobj.nextLine();

        
        str1 =str1.trim();
        str1 = str1.toLowerCase();
        
        str2 =str2.trim();
        str2 = str2.toLowerCase();
      
        if(str1.length() != str2.length())
        {
            System.out.println("Not Rotation");
        }
        else
        {
            String str3 = str1+str1;  

            if(str3.contains(str2))
            {
                System.out.println("Rotation");
            }
            else
            {
                System.out.println("Not Rotation");
            }
        }








        sobj.close();
        
    }
    
}
