import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program1
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Source File: ");
        String SrcFile = sobj.nextLine();

        System.out.print("Enter Destination File: ");
        String DestFile = sobj.nextLine();


        try {
            FileInputStream fis = new FileInputStream(SrcFile);
            FileOutputStream fos = new FileOutputStream(DestFile);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fis.read(Buffer)) != -1)
            {
                fos.write(Buffer,0, iRet);
            }
            
            fis.close();
            fos.close();
            
            System.out.println("Data Copied Successfully!");
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        sobj.close();

    }
}