import java.io.File;
import java.util.Scanner;

class program5 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory Name:");
        String dir = sobj.nextLine();

        File fobj = new File(dir);

        if(!fobj.exists())
        {
            System.out.println("Directory Does not exists");
            sobj.close();
            return;
            
        }
        if(!fobj.isDirectory())
        {
            System.out.println(" its no Directory");
            sobj.close();
            return;

        }

        File arr[] = fobj.listFiles();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].isFile())
            {
                System.out.println("File Name is: "+arr[i].getName());
                System.out.println("File Size is: "+arr[i].length());
            }
        }
        
        sobj.close(); 
    }
    
}
