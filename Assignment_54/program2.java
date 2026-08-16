/*


*/

import java.util.Scanner;

class program2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
       int percentage = 0;
       int Attendance = 0;
       int FamlyIncome = 0;

       System.out.println("Enter Your percentage:");
       percentage = sobj.nextInt();

       System.out.println("Enter Attendance:");
       Attendance = sobj.nextInt();

       System.out.println("Enter family income:");
       FamlyIncome = sobj.nextInt();


       if(percentage < 80)
       {
            System.out.println("Scolarship Rejected: Marks percentage is less than 80");
       }
       else if(Attendance < 75)
       {
            System.out.println("Scolarship Rejected: Attendance less than 75 percent.");
       }
       else if(FamlyIncome > 300000)
       {
            System.out.println("Scolarship Rejected: Family Income greater than 3,00,000.");
       }
       else
       {
           System.out.println("Scolarship Approved");
       }




        sobj.close();
    }
}