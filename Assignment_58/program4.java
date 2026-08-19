// Harshad Number

import java.util.Scanner;

class program4
{
    public static void main(String[] args) {
        
        int iNo=0;
        int iSum =0;
        int iDigit=0;
        int Temp=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        iNo = sobj.nextInt();

        Temp = iNo;
        while(iNo!=0)
        {
            iDigit = iNo %10;
            iSum = iSum + iDigit;
            iNo = iNo /10;
        }
        
        if((Temp % iSum) ==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }


        sobj.close();
    }
    
}
