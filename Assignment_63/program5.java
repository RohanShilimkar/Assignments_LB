import java.util.Scanner;

class NumberX
{
    public int i=0,temp=0,j=0;
    public int zero = 0;
   
    public boolean ChkSparse(int Arr[][],int Row,int Col)
    {
        
        for(i=0;i<Row;i++)
        {
            for(j=0;j<Col;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        for(i=0;i<Row;i++)
        {
            for(j=0;j<Col;j++)
            {
                if(Arr[i][j] == 0)
                {
                    zero++;
                }
            }
        }

        if(zero > (Row * Col ) / 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int brr[][] = null;
        int i=0,j=0;

        System.out.println("Enter Rows:");
        int Row = sobj.nextInt();
        
        System.out.println("Enter Col:");
        int Col = sobj.nextInt();


        brr= new int[Row][Col];

        System.out.println("Enter elements:");
        for(i=0;i<Row;i++)
        {
            for(j=0;j<Col;j++)
            {
                brr[i][j] = sobj.nextInt();
            }
        }

        NumberX n = new NumberX();

        boolean bRet = n.ChkSparse(brr, Row, Col);

        if(bRet == true)
        {
            System.out.println(bRet);
        }
        else
        {
            System.out.println(bRet);
        }

        sobj.close();
    }
}