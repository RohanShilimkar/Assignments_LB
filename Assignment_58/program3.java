// Perfect Number

import java.util.Scanner;

class program3
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        int iNo=0;
        int iSum=0;
    

        System.out.println("Enter Number:");
        iNo = sobj.nextInt();

        for(int i=1;i<iNo;i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i; 
            }
        }

        if(iSum == iNo)
        {
            System.out.println("It is Perfect Number");
        }
        else
        {
            System.out.println("It is Not Perfect Number");
        }

        sobj.close();
    }
    
}
