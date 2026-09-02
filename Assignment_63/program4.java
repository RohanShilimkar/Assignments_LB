import java.util.Scanner;

class NumberX
{
    public int i=0,temp=0,j=0;
    public boolean bFlag=false;
   
    public boolean ChkIdentity(int Arr[][],int Row,int Col)
    {
        bFlag = true;
        
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
               if(i==j)
               {
                    if(Arr[i][j] != 1)
                    {
                        bFlag = false;
                        break;
                    }
                }
               else
               {
                    if(Arr[i][j] != 0)
                    {
                        bFlag = false;
                        break;
                    }
               }
                
            }
        }
        return bFlag;
    }
}

class program4
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

        if(Row != Col)
        {
            System.out.println("Invalid Matrix");
            sobj.close();
            return;
        }


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

        boolean bRet = n.ChkIdentity(brr, Row, Col);

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