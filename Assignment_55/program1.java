import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        String WardType= null;
        String Insured = null;
        int Days = 0;
        int MedBill = 0;
        int ConultationFee = 0;
        int TotalBill = 0;
        int RoomCharges = 2000;
        int ICUCharges = 5000;
        int RoomBill = 0;
        int Insurance = 0;
        int FinalPay = 0;

        System.out.println("Enter how man days:");
        Days = sobj.nextInt();
        
        System.out.println("Enter Ward Type (Normal/ICU):");
        WardType = sobj.next();
        
        System.out.println("Enter Your medicine Bill:");
        MedBill = sobj.nextInt();
        
        System.out.println("Enter Consultation fee:");
        ConultationFee = sobj.nextInt();

        System.out.println("Insured (Yes/No):");
        Insured = sobj.next();

        if(WardType.equalsIgnoreCase("Normal"))
        {
            RoomBill = RoomCharges * Days;
            TotalBill = ConultationFee + MedBill + RoomBill;
        }
        else if(WardType.equalsIgnoreCase("ICU"))
        {
            RoomBill = ICUCharges * Days;
            TotalBill = ConultationFee + MedBill + RoomBill;
        }

        if(Insured.equalsIgnoreCase("Yes"))
        {
            Insurance = (TotalBill/100) * 70;
            
            if(Insurance > 50000)
            {
                Insurance= 50000;
                         
            }
            FinalPay = TotalBill-Insurance;
        }
        else
        {
            Insurance = 0;
            FinalPay = TotalBill - Insurance;
        }


        System.out.println("Your TotalBill is: "+TotalBill);
        System.out.println("Your Insurance Coverd: "+Insurance);
        System.out.println("Your Final Pay is: "+FinalPay);

        sobj.close();

    }   
}