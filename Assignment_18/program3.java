class Logic
{
    void PrintEvenNumbers(int num)
    {
        int iCnt=0;

        for(iCnt=0;iCnt<=num;iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
      
    }


}

class program3
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
    }
}