class Logic
{
    void CountEvenOddRange(int num)
    {
        int iEvenCount=0;
        int iOddCount=0;
        for(int iCnt=1;iCnt<=num;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even Count is "+iEvenCount);
        System.out.println("Odd Count is "+iOddCount);
    }


}

class program2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }
}