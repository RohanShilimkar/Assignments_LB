import java.util.Scanner;
import java.io.*;


class program2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        
        if(fobj.exists())
        {
            System.out.println("File does not exists");
            sobj.close();
            return;
        }

        if(fobj.isFile())
        {
            System.out.println("It is a Regular File! ");
            
        }
        else
        {
            System.out.println("It is a Not a Regular File! ");

        }






        sobj.close();
    }
    
}
