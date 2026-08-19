
// Automorphic Number

import java.util.Scanner;

public class program2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
       
        int iSquare=0;
        int iTemp=0;
        int iCount=0;
        int iDen=0;

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();
        
        iTemp = iNo;
        
        iSquare = iNo * iNo;

        while(iNo!=0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10,iCount);

        if((iSquare % iDen)==iTemp)
        {
            System.out.println("It is Aotumorphic Number");   
        }
        else
        {
            System.out.println("It is not Aotumorphic Number");

        }


        sobj.close();
    }
}
