// Armstrong Number

import java.util.Scanner;

class program2 
{
    public static void main(String[] args) {
        
        int Temp=0;
        int Count=0;
        int iDigit=0;
        int iSum=0;
        int iNo=0;
    

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
        iNo = sobj.nextInt();

        Temp = iNo;

        while(iNo!=0)
        {
            Count++;
            iNo = iNo/10;
        }

        iNo = Temp;

        while (iNo!=0) 
        {
            iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit,Count);
            iNo = iNo /10;
        }

        if(iSum == Temp)
        {
            System.out.println("It is Armstrong Number");

        }
        else
        {
            System.out.println("It is  not Armstrong Number");

        }

        sobj.close();
    }
    
}
