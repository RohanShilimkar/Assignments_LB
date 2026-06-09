class Logic
{
    void DisplayFactors(int num)
    {
        for(int iCnt=1 ;iCnt<num;iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }


}

class program3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}