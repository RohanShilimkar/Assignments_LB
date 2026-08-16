/*
    A bank wants to decide whether Customer is eleigible for a personal loan

 */

import java.util.Scanner;

class program2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter Age:");
        age = sobj.nextInt();
        
        System.out.println("Enter Monthly Income:");
        int Income = sobj.nextInt();
        
        System.out.println("Enter Credit Score:");
        int Score = sobj.nextInt();

        System.out.println("Existing Unpaid Loan: ?");
        String Loan = sobj.next();


        if(age < 21 || age > 60)
        {
            System.out.println("Loan Rejected Reason age not suitable! ");
        }
        
        if(Income<=25000) 
        {
            System.out.println("Loan Rejected Reason Income less that 25000");
            
        }
        
        if(Score<700)
        {
            System.out.println("Loan Rejected Reason Credit Score less than 700");
            
        }
        if(Loan.equals("yes"))
        {
            System.out.println("Loan Rejected Due to unpaid previous loans");
            
        }
        else
        {
            System.out.println("Loan Approved");
        }
         
       sobj.close();
    }    
}