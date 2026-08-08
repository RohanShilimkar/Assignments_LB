import java.util.*;
import java.io.*;

class program5 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Directory Name: ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            System.out.println("Files in Directory are:");

            int i=0;
            for(i=0 ; i<arr.length ; i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Invalid Directory");
        }
        sobj.close();
    }
    
}