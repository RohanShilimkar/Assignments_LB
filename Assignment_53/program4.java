/*
    A traffic police app record whether rider voilated the rules 
 */

import java.util.Scanner;

class program4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Fine = 0;

        System.out.println("Helmet worn?:");
        String helmet = sobj.nextLine();
        
        System.out.println("Licence Available?:");
        String licence = sobj.nextLine();
        
        System.out.println("Overspeeding?:");
        String Overspeeding = sobj.nextLine();
        
        if(helmet.equalsIgnoreCase("No"))
        {
            Fine = 500;
        }
        if(licence.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }
        if(Overspeeding.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1500;
        }
        System.out.println("Total Fine : "+Fine);
        
        sobj.close();
    
    }

    
}