import java.io.*;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Dname = null;
        String fpname = null;
        File fobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        byte Buffer[] = new byte[1024];
        String header = "";
        byte Bheader[] = null;
        int iRet =0;

        System.out.println("Enter Directory Name:");
        Dname = sobj.nextLine();
        
        System.out.println("Enter Pack File Name:");
        fpname = sobj.nextLine();

        fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fpobj = new File(fpname);

            fpobj.createNewFile();

            foobj = new FileOutputStream(fpobj);

            File arr[] = fobj.listFiles();

            System.out.println("Number of Files in Directory are:"+arr.length);

            for(int i=0;i<arr.length;i++)
            {
                fiobj = new FileInputStream(arr[i]);

                header = header + arr[i].getName();

                int size = 100 - header.length();
                for(int j=1;j<=size;j++)
                {
                    header = header + " ";
                }

                Bheader = header.getBytes();

                foobj.write(Bheader);

                foobj.write("\n".getBytes());
                while((iRet = fiobj.read(Buffer))!= -1)
                {
                    foobj.write(Buffer,0,iRet);
                    
                }
                    foobj.write("\n".getBytes());

                header = "";

                fiobj.close();
            }
        }
        else
        {
            System.out.println("No such Directory Found");
        }
        sobj.close();
    }
}
