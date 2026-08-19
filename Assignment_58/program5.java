// Palindrome Number

import java.util.Scanner;

class program5
{
    public static void main(String[] args) {
        
        int iNo=0;
        int iSum =0;
        int iDigit=0;
        int Temp=0;
        int iRev =0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        iNo = sobj.nextInt();

        Temp = iNo;
        while(iNo!=0)
        {
            iDigit = iNo %10;
            iRev = (iRev*10) + iDigit;
            iNo = iNo /10;
        }
        
        if(Temp == iRev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }


        sobj.close();
    }
    
}
