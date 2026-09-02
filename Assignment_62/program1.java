import java.util.Scanner;

class Addition
{
    private int i=0;
    private int j=0;
    private int iSum=0;

    public int AddDiagonal(int Arr[][],int iRow,int iCol)
    {

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                if(i==j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }
}


class program1
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


        Addition a = new Addition();

        int iRet = a.AddDiagonal(brr,iRow,iCol);

        System.out.println("Addition is: "+iRet);

        
        sobj.close();
    }
}