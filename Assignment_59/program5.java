
// Disarium Number

import java.util.Scanner;

public class program5 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
       
        int iTemp=0;
        int iCount=0;
        int Product = 0;
        int iSum = 0;    
        int iDigit=0;   

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();
        
        iTemp = iNo;      
        while (iNo!=0) 
        {
            iCount++;
            iNo = iNo/10;
        }

        iNo = iTemp;
        while(iNo!=0)
        {
            iDigit = iNo %10;
            
            Product = (int)Math.pow(iDigit,iCount);
            iSum = iSum + Product;

            iCount--;
            iNo = iNo / 10;
        }

        if(iTemp == iSum)
        {
            System.out.println("It is Disarium Number");
        }
        else
        {
            System.out.println("It is Not Disarium Number");  
        }


        sobj.close();
    }
}
