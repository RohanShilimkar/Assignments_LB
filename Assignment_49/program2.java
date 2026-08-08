import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;;

class program2 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name: ");
        String FileName = sobj.nextLine();
        
        try 
        {
            FileInputStream fis = new FileInputStream(FileName);
            System.out.println("File Opend Sucessfully!");

            int data = 0;

            while((data = fis.read()) != -1)
            {
                System.out.print((char)data);
            }
            fis.close();

        } catch (IOException e) 
        {
            
            System.out.println("Unable to open file!");
            System.out.println(e.getMessage());    
        }

        sobj.close();
        
    }
    
}
