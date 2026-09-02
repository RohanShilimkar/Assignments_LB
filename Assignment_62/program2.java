import java.util.Scanner;


class NumberX
{
    private int freq = 0;

    public int Freq(int arr[][],int iRow,int iCol,int iNo)
    {
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
               if(arr[i][j] == iNo)
               {
                    freq++;
               }
            }
        }

        return freq;
    }
}

class program2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows: ");
        int iRow = sc.nextInt();
        
        System.out.println("Enter Coloumn: ");
        int iCol = sc.nextInt();

        System.out.println("Enter Number to search:");
        int iNo = sc.nextInt();

        int brr[][] = new int[iRow][iCol];

        System.out.println("Enter data:");

        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                brr[i][j] = sc.nextInt();
            }
        }

        NumberX nobj = new NumberX();

        int iRet = nobj.Freq(brr, iRow, iCol, iNo);

        System.out.print("Frequency of Number is: "+iRet);

        sc.close();

    }
}