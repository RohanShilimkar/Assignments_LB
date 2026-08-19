
// Neon Number

import java.util.Scanner;

class program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
       
        int iDigit=0;
        int square = 0;
        int iSum =0;

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        square = iNo * iNo;
        while(square!=0)
        {
            iDigit = square %10;
            iSum = iSum + iDigit;
            square = square /10;
        }

        if(iNo == iSum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
        
        sobj.close();
    }
}