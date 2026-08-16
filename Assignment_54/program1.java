/*


*/


import java.util.Scanner;

class program1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int fare = 50;
        int km = 0;

        System.out.println("Enter Distance:");
        km = sobj.nextInt();
        
        System.out.println("Peak Hour:?");
        String hr = sobj.next();

        if(km < 0)
        {
            System.out.println("Invalid Distance.");
            sobj.close();
            return;
        }
        if(km <= 10)
        {
            fare = fare + (km * 12);

            if(hr.equalsIgnoreCase("Yes"))
            {
               fare = fare + (fare*20)/100;
            }
            System.out.println("Distance :"+km);
            System.out.println("Peak hour:(Yes/No)"+hr);
            System.out.println("Total Fee: "+fare);
        }

        if(km > 10)
        {
            fare = fare + (km *15);
            
            if(hr.equalsIgnoreCase("Yes"))
            {
                fare = fare + (fare*20)/100;
            }
            System.out.println("Distance :"+km);
            System.out.println("Peak hour:(Yes/No): "+hr);
            System.out.println("Total Fee: "+fare);
        }



        sobj.close();
    }
}