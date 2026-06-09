class Logic
{
    void Divisible(int num)
    {
        
        for(int iCnt=1;iCnt<num;iCnt++)
        {
            if((iCnt%2==0) && (iCnt % 3==0))
            {
                System.out.println(iCnt);
            }
        }

    }
}

class program5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.Divisible(30);
    }
}