import java.util.Scanner;

class NumberX
{
    private int Max=0;

    int i=0;
    int j=0;
    public int Largest(int arr[][],int iRow,int iCol)
    {
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                if(i==j && Max < arr[i][j])
                {
                    Max = arr[i][j];
                }
            }
        }
        
        for( i= 0 ; i < iRow ; i++)
        {
            for( j= 0 ; j < iCol ; j++)
            {
                if(Max < arr[i][iCol - i - 1])
                {
                    Max = arr[i][j];
                }             
            }
        }

        return Max;
    }
}

public class program3
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
            for(int j=0;j<brr.length;j++)
            {
                brr[i][j] = sobj.nextInt();
            }
        }

        NumberX n = new NumberX();

        int iRet = n.Largest(brr, iRow, iCol);

        System.out.println("Largest Number is: "+iRet);
    
        sobj.close();
    }
    
}
