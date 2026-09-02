import java.util.Scanner;

class Addition
{
    private int i=0;
    private int j=0;
    private int iSum=0;

    public void AddDiagonal(int Arr[][],int iRow,int iCol)
    {

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
               System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                iSum+= Arr[j][i];
            }
            System.out.print("Coloumn: "+i+" Sum is: "+iSum);
            iSum=0;
        }
    }
}


class program4
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

        a.AddDiagonal(brr,iRow,iCol);


        
        sobj.close();
    }
}