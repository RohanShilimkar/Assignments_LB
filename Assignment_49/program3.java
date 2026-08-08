import java.io.FileOutputStream;
import java.util.Scanner;

class program3 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter Fle Name: ");
        String FileName = sobj.nextLine();
        
        System.out.println("Enter data to write: ");
        String data = sobj.nextLine();

        try
        {
            // If Second Parameter missing java by default assumes false i.e(overwrite mode)
            // Old data is erased and new data is written 
            FileOutputStream fos = new FileOutputStream(FileName,true);
            fos.write(data.getBytes());
            System.out.println("Data Entered Successfully");
            fos.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Unable to open/write file");
            System.out.println(e.getMessage());

        }
        sobj.close();

    }
    
}
