import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
    
        Scanner sobj = new Scanner(System.in);

    System.out.println("Enter File Name:");
    String filename = sobj.nextLine();

    File fobj = new File(filename);

    if(!fobj.exists())
    {
        System.out.println("File Not Exist");
        sobj.close();
        return;
    }
    
    if(!fobj.isFile())
    {
        System.out.println("Its Not a Regular File");
        sobj.close();
        return;
    }

    try {
        FileInputStream fis = new FileInputStream(filename);
        int checksum =0;

        byte buffer[] = new byte[1024];

        int iRet = 0;
        while((iRet = fis.read(buffer)) != -1)
        {
            for(int i=0;i<iRet;i++){
                checksum = checksum + buffer[i];
            }

        }

        fis.close();
        System.out.println("Checksum is: "+checksum);
    } 
    catch (Exception e) 
    {
        System.out.println(e.getMessage());
    }
    sobj.close();

    }
    
}