import java.io.File;
import java.util.Scanner;

class program3 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Directory Name:");
        String Directory = sobj.nextLine();

        File fobj = new File(Directory);


        if(fobj.exists())
        {
            System.out.println("Directory already exists");
            sobj.close();
            return;
        }
        
        boolean bRet = false;

        bRet = fobj.mkdir();
        
        if(bRet == true)
        {
            System.out.println("Directory Created!");

        }
        else
        {
            System.out.println("Unable to create Directory!");
        }

        if(fobj.isDirectory())
        {
            System.out.println(Directory+" Is Directory!");        
        }
        else
        {
            System.out.println(Directory+" Is Not a Directory");

        }

        sobj.close();
        
    }
    
}
