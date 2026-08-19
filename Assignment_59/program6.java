
// Trimorphic Number

import java.util.Scanner;

public class program6 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
       
        int iQube=0;
        int iTemp=0;
        int iCount=0;
        int iDen=0;

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();
        
        iTemp = iNo; 
        iQube = iNo * iNo * iNo;

        while(iNo!=0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDen = (int)Math.pow(10,iCount);

        if((iQube % iDen)==iTemp)
        {
            System.out.println("It is Trimorphic Number");   
        }
        else
        {
            System.out.println("It is not Trimorphic Number");

        }

        sobj.close();
    }
}
