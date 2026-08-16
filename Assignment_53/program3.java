/*
    Warehouse has product in stock , customer places order
    the system checks if enough stock exist

*/

import java.util.Scanner;

class program3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int stock=0;
        int Quantity=0;

        System.out.println("Enter Current Stock:");
        stock = sobj.nextInt();
        
        System.out.println("Enter Requested Quantity:");
        Quantity = sobj.nextInt();

        if(stock <0)
        {
            System.out.println("Stock cannot be negative");
        }

        if(Quantity < 0)
        {
            System.out.println("Quantity must be greater than 0");
        }

        if(Quantity > stock)
        {
            System.out.println("Order Failed:Inssufficient Stock");
        }

        System.out.println("Oreder Processed Successfully.");

        stock = stock - Quantity;
        
        System.out.println("Remaining Stock: "+stock);

        if(stock <=5)
        {
            System.out.println("Low Stock Alert!");
        }     

        sobj.close();

    
    }

    
}