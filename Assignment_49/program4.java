import java.io.*;
import java.util.Scanner;

class program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter FileName: ");
        String FileName = sobj.nextLine();

        try 
        {
            File fobj = new File(FileName);
            if(fobj.createNewFile())
            {
                System.out.println("File Created Successfully!");
            }
            else{
                
                System.out.println("File Already Exist!");
            }

            

        } catch (Exception e) {
            System.out.println("Unable to create File");
            System.out.println(e.getMessage());
        }
        sobj.close();
    }
}