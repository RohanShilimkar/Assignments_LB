import java.util.Scanner;

class Program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        String ClassType = null;
        int BookingHoursBefore = 0;
        int Age = 0;
        int BaseFare = 0;
        int ClassCharge = 0;
        int FinalFare = 0;

        System.out.println("Enter Distance:");
        Distance = sobj.nextInt();

        System.out.println("Enter class (Sleeper/3AC/2AC):");
        ClassType = sobj.next();

        System.out.println("Enter booking hours before journey:");
        BookingHoursBefore = sobj.nextInt();

        System.out.println("Enter Age:");
        Age = sobj.nextInt();


        if(Distance <= 100)
        {
            BaseFare = 100;
        }
        else if(Distance <= 300)
        {
            BaseFare = 200;
        }
        else if(Distance <= 500)
        {
            BaseFare = 300;
        }
        else
        {
            BaseFare = 500;
        }

        if(ClassType.equalsIgnoreCase("Sleeper"))
        {
            ClassCharge = 100;
        }
        else if(ClassType.equalsIgnoreCase("3AC"))
        {
            ClassCharge = 300;
        }
        else if(ClassType.equalsIgnoreCase("2AC"))
        {
            ClassCharge = 500;
        }


        FinalFare = BaseFare + ClassCharge;


        if(BookingHoursBefore <= 24)
        {
            FinalFare = FinalFare + (FinalFare/100) * 30;
        }

        if(Age >= 60)
        {
            FinalFare = FinalFare - (FinalFare/ 100)* 40;
        }

        System.out.println("Base Fare: " +BaseFare);
        System.out.println("Class Charge: " +ClassCharge);
        System.out.println("Final Fare: " +FinalFare);

        sobj.close();
    }
}