import java.io.*;
import java.util.Scanner;

class program2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        FileOutputStream foobj = null;
        String Dname = null;
        String fname = null;
        int i = 0;

        System.out.println("Enter Directory Name:");
        Dname = sobj.nextLine();
        
        System.out.println("Ente New File Name:");
        fname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();
            
            foobj = new FileOutputStream(fname);

            String str = null;

            for(i=0;i<arr.length;i++)
            {
                if(arr[i].isFile())
                {
                    str = arr[i].getName();
                    foobj.write(str.getBytes());
                    foobj.write("\n".getBytes());

                }
            }

            System.out.println("Successfully Excuted");
    
            foobj.close();
        }
        
        sobj.close();
    }
    
}
