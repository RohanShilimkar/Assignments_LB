import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class program3 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        String Dname = null;
        String fname = null;
        int i=0;
        int iRet=0;


        System.out.println("Enter Directory Name:");
        Dname = sobj.nextLine();
        
        System.out.println("Enter File Name:");
        fname = sobj.nextLine();

        fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            fobj.createNewFile();

            foobj = new FileOutputStream(fname);

            byte Buffer[] = new byte[100];
            
            for(i=0;i<arr.length;i++)
            {
                fiobj = new FileInputStream(arr[i]);

                while((iRet = fiobj.read(Buffer))!= -1)
                {
                    foobj.write(Buffer, 0, iRet);
                }
            }

            System.out.println("Successfully Excuted");

            fiobj.close();
            foobj.close();

        }
        else
        {
            System.out.println("No Suc Directory Found");
        }
        sobj.close();
        
    }
    
}
