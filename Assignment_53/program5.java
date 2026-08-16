/*
    A tax portal calculates income tax Based on annual Income
    using progressive slabs 
*/

import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Income = 0;
        float Tax = 0;


        System.out.println("Enter Your Income:");
        Income = sobj.nextInt();
    
        if(Income < 0)
        {
            System.out.println("Enter Valid Income");
            sobj.close();
            return;
        }

        if(Income <= 250000)
        {
            System.out.println("Actual Income: "+Income);
            System.out.println("Total Tax Payable : "+Tax);            
        }

        if(Income >= 250001 && Income <= 500000)
        {
            Tax = (Income /100) * 5;

            System.out.println("Actual Income: "+Income);
            System.out.println("Actual Income: "+Tax);
        }

        if(Income >= 500001 && Income <= 1000000)
        {
            Tax = (Income /100) * 20;
            System.out.println("Actual Income: "+Income);
            System.out.println("Actual Income: "+Tax);
            
        }

        if(Income >1000000)
        {
            Tax = (Income /100) * 30;
            System.out.println("Actual Income: "+Income);
            System.out.println("Actual Income: "+Tax);
        }
         
        sobj.close();    
    }

    
}