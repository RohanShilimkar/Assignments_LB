import java.util.Scanner;

class program2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iCol=0;
        int iRow=0;
        int Empty=0;
        int Booked=1;
        int Cinema[][] = null;
        int i=0;
        int j=0;
        int Count=0;
        int booking = 0 ;
        int Max=0;
        int FullRow=0;


        System.out.println("Enter Rows:");
        iRow = sobj.nextInt();

        System.out.println("Enter Seats :");
        iCol = sobj.nextInt();

        Cinema = new int[iRow][iCol];

        System.out.println("Enter (0/1):");
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                Cinema[i][j] = sobj.nextInt();
            }
        }

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Cinema[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                if(Cinema[i][j] == Booked)
                {
                Count = Count + Cinema[i][j];
                }
            }
        }
        System.out.println("Total Booked Seats: "+Count);

       
        
         for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {  
                if(Cinema[i][j] == Booked)
                {
                   Count++;
                }
            }
            if(Count > Max)
            {
                Max = Count;
                booking++;

            }
            Count = 0;
        }
        System.out.println("Row with Max Bookings: "+(booking+1));
        
         for(i=0;i<iRow;i++)
        {
             
            for(j=0;j<iCol;j++)
            {  
                if(Cinema[i][j] == Booked)
                {
                   Count++;
                }
    
            }
            if(Count==iCol)
            {
                FullRow=1;
                break;
            }
           Count=0;
        }

        
         if(FullRow == 1)
        {
            System.out.println("Full Row Exist: Yes");
        }
        else
        {
            System.out.println("Full Row Exist: No");
        }


    sobj.close();
    }
    
}
