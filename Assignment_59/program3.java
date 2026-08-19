//Spy Number

import java.util.Scanner;

class program3 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iSum = 0;
        int Product = 1;
        int iDigit = 0;

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        while(iNo!=0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            Product = Product * iDigit;
            iNo = iNo / 10;
        }

        if(iSum == Product)
        {
            System.out.println("It is Spy Number");
        }
        else
        {
            System.out.println("It is Not Spy Number");
    
        }








        sobj.close();
        
    }
    
}
