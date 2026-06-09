class Logic
{
    void CountFactors(int num)
    {
        int iCount=0;
        for(int iCnt = 1 ; iCnt<num;iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount);

    }
}

class program4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}