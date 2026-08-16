import java.util.Scanner;

class program5 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Battery = 0;

        System.out.println("Enter Battery Percentage:");
        Battery = sobj.nextInt();

        if(Battery < 0  && Battery > 100)
        {
            System.out.println("Invalid Input");
            sobj.close();
            return;
        }

        if(Battery  <= 5)
        {
            System.out.println("Battery Percentage: "+Battery+" %");
            System.out.println("Status: Critical");
        }
        else if(Battery <= 15)
        {
            System.out.println("Battery Percentage: "+Battery+" %");
            System.out.println("Status: Low");
        }
        else
        {
            System.out.println("Battery Percentage: "+Battery+" %");
            System.out.println("Status: Normal");
        }
        

        sobj.close();
    }
    
}
