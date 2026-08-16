/*
    Shopping mall parking gate record entry and exit duration in hours

*/

import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int hrs=0;
        int fee=0;

        System.out.println("Enter how many hours:");
        hrs = sobj.nextInt();
        
        if(hrs <0)
        {
            System.out.println("Invalid hours!");
        }

        if(hrs<2)
        {
            fee = 20 ;
            System.out.println("Total Parking duration: "+hrs);
            System.out.println("Total Parking Fee: "+fee);
            
        }
        else if(hrs <= 2 )
        {
            fee = 10* hrs;
            System.out.println("Total Parking duration: "+hrs);
            System.out.println("Total Parking Fee: "+fee);
        }
        else 
        {
            fee = 20 + ((hrs - 2)) * 10;

            if(hrs > 10)
            {
                fee = fee + 50;
            }
            
            System.out.println("Total Parking duration: "+hrs);
            System.out.println("Total Parking Fee: "+fee);

        }

         
        sobj.close();

    
    }

    
}