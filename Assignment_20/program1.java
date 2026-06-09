class Logic 
{
    void SumEvenNumbers(int num)
    {
        int iEvenSum=0;
        for(int iCnt=0;iCnt<num;iCnt++)
        {
            if(iCnt%2==0)
            {
                iEvenSum += iCnt;
            }
        }
        
        System.out.println(iEvenSum);
    }

}

class program1
{
    public static void main(String args[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}