
// Sunny Number

import java.util.Scanner;

class program3 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        
        int square=0;

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

    
        iNo = iNo +1;
        
        square =(int)Math.sqrt(iNo);

        if(square * square == iNo)
        {
            System.out.println("It is Sunny Number");
        }
        else
        {
            System.out.println("It is Not Sunny Number");
        }






        sobj.close();
        
    }
    
}
