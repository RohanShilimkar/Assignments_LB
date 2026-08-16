import java.util.Scanner;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int minutes;
        int charge = 0;

        System.out.print("Enter call duration: ");
        minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid minutes");
            sobj.close();
            return;
        }

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = 10 + (minutes - 15) * 2;
        }

        System.out.println("Call Duration: " + minutes + " minutes");
        System.out.println("Total Call Charge: " + charge);

        sobj.close();
    }
}