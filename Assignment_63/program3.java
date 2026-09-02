import java.util.Scanner;


class NumberX
{
    public int i=0,temp=0,j=0;
   
    public void ReverseCol(int Arr[][],int Row,int Col)
    {
        for(i=0;i<Row;i++)
        {
            for(j=0;j<Col;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }


        for(i=0;i<Row;i=i+2)
        {
            for(j=0;j<Col;j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[Row-1][j]; 
                Arr[Row-1][j] = temp;
            }
        }


        System.out.println("After");
        for(i=0;i<Row;i++)
        {
            for(j=0;j<Col;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }



            
    }


}

class program3
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

        n.ReverseCol(brr, Row, Col);

        sobj.close();
    }
}