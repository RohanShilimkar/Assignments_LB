import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter FileName:");
        String FileName = sobj.nextLine(); 

        try
        {
            FileInputStream fis = new FileInputStream((FileName));
            System.out.println("File Opend SuccesFully!");
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to open file!");
            System.out.println(e.getMessage());

        }

        sobj.close();
    }
}