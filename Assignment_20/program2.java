class Logic 
{
    void PrintReverse(int num)
    {
        int iCnt=0;
        for(iCnt=num;iCnt>0;iCnt--)
        {
            System.out.println(iCnt);
        }
    }

}

class program2
{
    public static void main(String args[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}