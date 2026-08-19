
// Strong Number

import java.util.Scanner;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iDigit = 0;
        int iFact = 1;

        System.out.println("Enter A Number");
        int No = sobj.nextInt();

        int temp = No;
        int iSum=0;

        while(No!=0)
        {
            iDigit = No % 10;
            while(iDigit !=0)
            {
                iFact = iFact * iDigit;
                iDigit--;
            }
            iSum = iSum + iFact;
            No = No / 10;
            iFact = 1;
        }

        if(temp == iSum)
        {
            System.out.println("It is Strong Number");
        }
        else
        {
            System.out.println("It is not Strong Number");

        }

        sobj.close();

    }
}