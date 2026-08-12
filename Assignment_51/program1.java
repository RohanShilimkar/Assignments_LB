import java.io.File;
import java.util.Scanner;

class program1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Dname = null;
        File fobj = null;
        int i = 0;
            
        System.out.println("Enter Directory Name:");
        Dname = sobj.nextLine();

        fobj = new File(Dname);

        
        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();
            
            for(i=0;i<arr.length;i++)
            {
                if(arr[i].isFile())
                {
                    System.out.println(arr[i].getName());
                }
            }
        }
        else
        {
            System.out.println("No such Directory!");
        }
    sobj.close();       
    }
}