class Logic 
{
    void FindSmallestDigit(int num)
    {
        int iCnt=0,iDigit=0;
        int iMin=num;
        
        while(num!=0)
        {
            iDigit = num % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            num = num /10;
        }
        System.out.println(iMin);
    }
}

class program5
{
    public static void main(String args[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(458472);
    }
}