class Logic
{
    void PrintEvenNumbers(int num)
    {
        int iCnt=0;

        for(iCnt=0;iCnt<=num;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
        // while(iCnt<=num)
        // {
        //     if(iCnt %2==0)
        //     {
        //       System.out.println(iCnt);
        //     }
        //     iCnt++;
        // }
    }


}

class program2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
    }
}