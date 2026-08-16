import java.util.Scanner;

/**

 */
public class program4 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int prices[] = null;
        int iCount=0;


        System.out.println("Enter Your Budget:");
        Budget = sobj.nextInt();

        System.out.println("Enter how many Items:");
        int n = sobj.nextInt();
        
        prices = new int[n];

        System.out.println("Enter prices :");
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]  <= Budget)
            {
                prices[i] = sobj.nextInt();
                Budget = Budget-prices[i];
                iCount++;
        
            }
            
        }

        System.out.println("Items Purchased: "+iCount);
        System.out.println("Reamining Balance: "+Budget);
        
        

        sobj.close();
        
    }

    
}