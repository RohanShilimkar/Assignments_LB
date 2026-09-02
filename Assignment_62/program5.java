import java.util.Scanner;


class Swap
{
    public int i = 0;
    public int j = 0;
    public int temp = 0;

    public void SwapRow(int Arr[][],int iRow,int iCol)
    {

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(i=0;i<iRow;i=i+2)
        {
            for(j=0;j<iCol;j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp ;
            }
        }
    }
}

class program5 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int brr[][] = null;

        System.out.println("Enter How Many Rows:");
        int iRow= sobj.nextInt();
        
        System.out.println("Enter How Many Columns:");
        int iCol= sobj.nextInt();

        brr = new int[iRow][iCol];

        System.out.println("Enter data:");
        for(int i=0;i<brr.length;i++)
        {
            for(int j=0;j<brr[i].length;j++)
            {
                brr[i][j] = sobj.nextInt();
            }
        }

        Swap s = new Swap();

        s.SwapRow(brr,iRow,iCol);

        System.out.println("After swap.");
        
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.print(brr[i][j]+"\t");
            }
            System.out.println();
        }

        sobj.close();
    }
    
    
}
