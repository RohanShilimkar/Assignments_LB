import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        int hotelCharges = 3000;
        int FinalAmt = 0;

        System.out.println("Number of Days Stayed");
        days = sobj.nextInt();

        if(days <0)
        {
            sobj.close();
            return;
        }

        FinalAmt = days * hotelCharges;

        if(days > 7)
        {
            FinalAmt = FinalAmt - (FinalAmt/100) * 5;
        }

        System.out.println("Total Stay Dureation: "+days);
        System.out.println("Final Bill Amount: "+FinalAmt);






        sobj.close();
        
    }
}